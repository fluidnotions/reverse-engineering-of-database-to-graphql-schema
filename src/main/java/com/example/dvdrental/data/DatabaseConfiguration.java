package com.example.dvdrental.data;

import com.introproventures.graphql.jpa.query.schema.impl.GraphQLJpaSchemaBuilder;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

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
            var def = build.getDefinition();
            logger.info("GraphQL Schema: {}", def.toString());
        }catch (Exception e){
            logger.error("Error while generating GraphQL Schema", e);
            e.printStackTrace();
        }
    }

}
