package com.curso.springboot.service;

import com.curso.springboot.repository.ProductRepository;
import com.curso.springboot.repository.ProductRepositoryA;
import com.curso.springboot.repository.ProductRepositoryB;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductService {

    @PostConstruct
    public void postConstruct() {
        System.out.println("===> Creando instancia de PostConstructor" + this.getClass().getSimpleName());
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("===> Destruyendo instancia de PreDestroy" + this.getClass().getSimpleName());
    }


    //@Qualifier("productMySQLRepository")
    private ProductRepository productRepository;
    public ProductService( ) {
        System.out.println("Creando instancia de " + this.getClass().getSimpleName());
    }

    public void save(String nombre){
        productRepository.save(nombre);

    }
    public void remove(String nombre){
        productRepository.save(nombre);
    }

    @Qualifier("productXMLRepository")
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
