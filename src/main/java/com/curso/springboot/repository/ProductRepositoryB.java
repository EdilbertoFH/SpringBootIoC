package com.curso.springboot.repository;

public class ProductRepositoryB implements ProductRepository {

    public ProductRepositoryB() {
        System.out.println("Creando instancia de " + this.getClass().getSimpleName());
    }
    public void save(String name){
        System.out.println("== SAVE " + this.getClass().getSimpleName() + " ==");
        System.out.println("Producto guardado exitosamente: " + name);
    }

    public void remove (String name){
        System.out.println("== REMOVE " + this.getClass().getSimpleName() + " ==");
        System.out.println("Producto eliminado exitosamente: " + name);
    }
}
