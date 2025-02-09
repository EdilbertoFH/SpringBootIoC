package com.curso.springboot.service;

import com.curso.springboot.repository.ProductRepository;
import com.curso.springboot.repository.ProductRepositoryA;
import com.curso.springboot.repository.ProductRepositoryB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ProductService {

    @Qualifier("createProductRepositoryA")
    @Autowired
    private ProductRepository productRepositoryA;
    @Qualifier("createProductRepositoryB")
    @Autowired
   private ProductRepository productRepositoryB;


    public ProductService() {
        System.out.println("Creando instancia de " + this.getClass().getSimpleName());
    }

    public void save(String nombre){
        productRepositoryA.save(nombre);

    }
    public void remove(String nombre){
        productRepositoryA.save(nombre);
    }
}
