package com.crudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CrudAppApplication {

	@Configuration
	@EnableWebMvc
	public class CorsConfig implements WebMvcConfigurer {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedOrigins("http://localhost:8080")
					.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

}
