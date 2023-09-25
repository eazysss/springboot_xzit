package com.xzit.service;

import com.xzit.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectList();
    Student selectId(Integer id);
    int save(Student student);
    int update(Student student);
    int delete(Integer id);
}
