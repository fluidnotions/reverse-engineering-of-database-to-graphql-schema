package com.example.dvdrental;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.introproventures.graphql.jpa.query.schema.GraphQLExecutor;
import com.introproventures.graphql.jpa.query.web.GraphQLController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@DependsOn("graphQLExecutor")
public class GraphQLJpaRestConfiguration {

    @Autowired
    private GraphQLExecutor graphQLExecutor;

    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    public GraphQLController graphQLController() {
        return new GraphQLController(graphQLExecutor, objectMapper);
    }
}

