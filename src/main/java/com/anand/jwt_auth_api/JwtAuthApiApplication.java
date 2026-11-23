package com.anand.jwt_auth_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@EnableMethodSecurity
@SpringBootApplication
public class JwtAuthApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthApiApplication.class, args);
	}

}
