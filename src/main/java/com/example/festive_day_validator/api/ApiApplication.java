package com.example.festive_day_validator.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.festive_day_validator.api.infraestructure.repositories.FestivoRepositoryImpl;

@SpringBootApplication
public class ApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
