package com.example.sprangular;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SprangularApplication {
//	@Bean
//    CommandLineRunner demo(PersonRepository repo) {
//	    return args -> {
//	        repo.findAll().forEach(System.out::println);
//        };
//    }

    public static void main(String[] args) {
        SpringApplication.run(SprangularApplication.class, args);
    }
}
