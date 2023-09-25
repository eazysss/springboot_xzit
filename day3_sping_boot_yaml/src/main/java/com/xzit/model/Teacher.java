package com.xzit.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "teacher")
public class Teacher {
    private String id;
    private int age;
    private int num1;
    private long numlong1;
    private long numlong2;
    private String value;
}
