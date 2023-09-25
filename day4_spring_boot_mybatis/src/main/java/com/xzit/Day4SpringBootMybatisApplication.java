package com.xzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xzit.mapper"})
public class Day4SpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day4SpringBootMybatisApplication.class, args);
    }

}
