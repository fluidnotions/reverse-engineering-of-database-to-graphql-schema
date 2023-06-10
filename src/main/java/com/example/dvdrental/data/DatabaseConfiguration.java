package com.example.dvdrental.data;

import com.introproventures.graphql.jpa.query.schema.impl.GraphQLJpaSchemaBuilder;
import graphql.schema.idl.SchemaPrinter;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class DatabaseConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(DatabaseConfiguration.class);

    @Autowired
    private EntityManager entityManager;

    @PostConstruct
    void generateSchema() {
        logger.info("generating GraphQL Schema");
        try{
            GraphQLJpaSchemaBuilder schemaBuilder = new GraphQLJpaSchemaBuilder(entityManager);
            var build = schemaBuilder.build();
            String schemaString = new SchemaPrinter().print(build);
            try {
                Path output = Paths.get("schema.graphql");
                logger.info("writing GraphQL Schema to file: {}", output.toAbsolutePath());
                Files.write(output, schemaString.getBytes());
            } catch (IOException e) {
                logger.error("Error while writing schema to file", e);
            }
        }catch (Exception e){
            logger.error("Error while generating GraphQL Schema", e);
            e.printStackTrace();
        }
    }

}
