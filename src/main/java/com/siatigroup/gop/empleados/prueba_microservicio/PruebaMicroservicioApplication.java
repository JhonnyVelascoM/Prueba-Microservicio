package com.siatigroup.gop.empleados.prueba_microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class PruebaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaMicroservicioApplication.class, args);
	}
@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Rastrear Paquetes - SiatiBox")
						.version("V 1.0")
						.description("Microservicio para Rastrear Paquetes")
						.license(new License().name("SIATIGROUP S.A. - 2023")));
}
}