package com.petreca.challenge_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * Design Patter Challenge DIO
 */
@EnableFeignClients
@SpringBootApplication
public class ChallengeDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeDesignPatternApplication.class, args);
	}

}
