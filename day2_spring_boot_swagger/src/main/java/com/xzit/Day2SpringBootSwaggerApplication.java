package com.xzit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class Day2SpringBootSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day2SpringBootSwaggerApplication.class, args);
    }

}
