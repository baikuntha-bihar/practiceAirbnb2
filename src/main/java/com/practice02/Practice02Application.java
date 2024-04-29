package com.practice02;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Practice02Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice02Application.class, args);
	}




	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
