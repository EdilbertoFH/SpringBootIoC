package com.curso.springboot.service;

import com.curso.springboot.repository.ProductRepository;
import com.curso.springboot.repository.ProductRepositoryA;
import com.curso.springboot.repository.ProductRepositoryB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {



    //@Qualifier("productMySQLRepository")
    private ProductRepository productRepository;

    @Autowired
    public ProductService( @Qualifier("productXMLRepository") ProductRepository productRepository ) {
        this.productRepository = productRepository;
        System.out.println("Creando instancia de " + this.getClass().getSimpleName());
    }

    public void save(String nombre){
        productRepository.save(nombre);

    }
    public void remove(String nombre){
        productRepository.save(nombre);
    }
}
