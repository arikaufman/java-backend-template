package com.domain.java_backend_template;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTemplateApplication.class, args);
	}

	@Bean //ModelMapper Bean needed to be explicitly defined.
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}