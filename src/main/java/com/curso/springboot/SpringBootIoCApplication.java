package com.curso.springboot;

import com.curso.springboot.repository.ProductRepositoryA;
import com.curso.springboot.repository.ProductRepositoryB;
import com.curso.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIoCApplication implements CommandLineRunner {
	//Instanciacion de objetos almancenados en la configuracion de BEANS manejados directamente por el contenedor de SPRING
	@Autowired
	private ProductService productService;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World con la interfaz comand line runer");

	}

	@Bean
	public CommandLineRunner comandoGenerico() {
		return (args) -> {
			System.out.println("Hello World con la interfaz comando generico Expresion Landa" );

		};
	}

	//Probando instanciacion de dependencias con @Autowired
	@Bean
	public CommandLineRunner comandoUtilizandoAutowured() {
		return args -> {
			System.out.println("PRODUCTSERVICE");
			productService.save("Control Remoto");
			productService.remove("Mouse USB Generico");
		};
	}
}
