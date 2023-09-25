package com.xzit.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
public class Student {
    private String name;
    private String gender;
    private int age;
    private Map<String, Integer> scoreMap;
}
