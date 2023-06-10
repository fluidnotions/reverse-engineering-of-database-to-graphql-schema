package com.example.dvdrental.data;

import com.introproventures.graphql.jpa.query.schema.GraphQLExecutor;
import com.introproventures.graphql.jpa.query.schema.impl.GraphQLJpaExecutor;
import com.introproventures.graphql.jpa.query.schema.impl.GraphQLJpaSchemaBuilder;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaPrinter;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class GraphQLJpaConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(GraphQLJpaConfiguration.class);
    private GraphQLSchema graphQLSchema;
    public GraphQLJpaConfiguration(EntityManager entityManager) {
        GraphQLJpaSchemaBuilder schemaBuilder = new GraphQLJpaSchemaBuilder(entityManager);
        graphQLSchema = schemaBuilder.build();
    }
    @Bean
    public GraphQLExecutor graphQLExecutor() {
        return new GraphQLJpaExecutor(graphQLSchema);
    }

    @PostConstruct
    void writeReferenceSchemaToFile() {
        logger.info("generating GraphQL Schema");
        try{
            String schemaString = new SchemaPrinter().print(graphQLSchema);
            Path output = Paths.get("docs", "schema", "schema.graphql");
            try {
                Files.createDirectories(output.getParent());
            } catch (IOException e) {}
            logger.info("writing GraphQL Schema to file for reference purposes: {}", output.toAbsolutePath());
            Files.write(output, schemaString.getBytes());
        }catch (IOException e){
            logger.error("Error while generating GraphQL Schema", e);
            e.printStackTrace();
        }
    }

}
