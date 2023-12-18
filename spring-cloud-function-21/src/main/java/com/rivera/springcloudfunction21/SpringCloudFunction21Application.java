package com.rivera.springcloudfunction21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringCloudFunction21Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunction21Application.class, args);
	}

	@Bean
	public Function<String, String> reverse(){
		return (s) -> String.valueOf(new StringBuilder(s).reverse());
	}
}
