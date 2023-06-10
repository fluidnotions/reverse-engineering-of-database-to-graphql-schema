package com.example.dvdrental;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.introproventures.graphql.jpa.query.web.autoconfigure.GraphQLControllerAutoConfiguration;

@SpringBootApplication
public class DvdrentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdrentalApplication.class, args);
	}

}
