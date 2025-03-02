package com.curso.springboot.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShopingCarService {
    private final  List<String> products = new ArrayList<>();
    private Integer counter = 0;

    public void add(){
        counter++;
        products.add(counter.toString() + " - Microfono");

    }

    public List<String>get(){
        return products;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("===> Creando instancia de PostConstructor" + this.getClass().getSimpleName());
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("===> Destruyendo instancia de PreDestroy" + this.getClass().getSimpleName());
    }

}
