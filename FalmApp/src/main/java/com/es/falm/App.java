package com.es.falm;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.es.falm.config.SwaggerConfig;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = { "com.es.falm" })
@Import(SwaggerConfig.class)
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public ModelMapper getMapper() {		
		return new ModelMapper();
	}

}
