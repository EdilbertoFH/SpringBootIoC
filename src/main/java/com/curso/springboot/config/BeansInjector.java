package com.curso.springboot.config;

import com.curso.springboot.repository.ProductRepositoryA;
import com.curso.springboot.repository.ProductRepositoryB;
import com.curso.springboot.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjector {

    @Bean
    public ProductRepositoryA createProductRepositoryA() {
        return new ProductRepositoryA();
    }

    @Bean
    public ProductRepositoryB createProductRepositoryB() {
        return new ProductRepositoryB();
    }
    @Bean
    public ProductService createProductService() {
        return new ProductService();
    }
}
