package com.example.putApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class PutApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PutApiApplication.class, args);
	}
}
