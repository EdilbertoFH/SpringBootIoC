package com.curso.springboot;

import com.curso.springboot.repository.ProductRepositoryA;
import com.curso.springboot.repository.ProductRepositoryB;
import com.curso.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootIoCApplication  {
	//Instanciacion de objetos almancenados en la configuracion de BEANS manejados directamente por el contenedor de SPRING

	@Autowired
	private ProductService productService;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@RequestMapping("/example")
	public String example() {
		productService.save("Zapatos Nike Air Force1");
		return "Hello SprinBootIoC ";
	}

}
