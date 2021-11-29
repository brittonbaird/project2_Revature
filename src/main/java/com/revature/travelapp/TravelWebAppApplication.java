package com.revature.travelapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = { "com.revature.travelapp.entity" })
public class TravelWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelWebAppApplication.class, args);
	}
}
