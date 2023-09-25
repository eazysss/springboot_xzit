package com.xzit.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "teacher")
public class Teacher {
    private String name;
    private String gender;
    private int age;
    private List<Student> stuList;
}
