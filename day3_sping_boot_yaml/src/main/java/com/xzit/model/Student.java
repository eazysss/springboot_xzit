package com.xzit.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    private String name;
    private int age;
}
