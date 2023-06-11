package com.example.dvdrental.data;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class GraphQLJpaConfigurationTest {

    private static final Logger logger = LoggerFactory.getLogger(GraphQLJpaConfigurationTest.class);

    @Autowired
    private JpaDao jpaDao;

    @Test
    public void testRepositoryIntrospectionAccessibility() {
        List<CrudRepository<?, ?>> repositories = jpaDao.getAllReRepositories();
        repositories.forEach(repository -> {
            var outputString = new StringBuffer();
            Arrays.stream(AopProxyUtils.proxiedUserInterfaces(repository)).map(Class::getCanonicalName).filter(n -> n.startsWith("com.example")).forEach(name -> outputString.append(" interface name: %s\n".formatted(name)));
            var methods = repository.getClass().getDeclaredMethods();
            Arrays.stream(methods).map(method -> method.getName()).forEach(name -> outputString.append(" method name: %s\n".formatted(name)));
            logger.info(outputString.toString());
        });

    }
}
