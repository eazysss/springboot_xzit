package com.xzit.controller;

import com.xzit.model.Student;
import com.xzit.model.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Resource
    private Teacher teacher;

    @GetMapping()
    public Object getTeacher() {
        return teacher;
    }

    @GetMapping("/AvgStu")
    public Object getAvgStu() {
        StringBuilder sb = new StringBuilder();
        List<Student> list = teacher.getStuList();
        for (Student student : list) {
            int total = 0;
            Map<String, Integer> map = student.getScoreMap();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                total += entry.getValue();
            }
            sb.append(student.getName()).append("的平均成绩为:").append(total / map.size()).append("<br>");
        }
        return sb;
    }

    @GetMapping("/AvgChinese")
    public Object getAvgChinese() {
        int total = 0;
        List<Student> list = teacher.getStuList();
        for (Student student : list) {
            Map<String, Integer> map = student.getScoreMap();
            total += map.get("Chinese");
        }
        return ("语文的平均成绩为" + (total / list.size()));
    }
}
