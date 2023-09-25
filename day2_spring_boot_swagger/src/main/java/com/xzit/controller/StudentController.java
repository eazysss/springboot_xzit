package com.xzit.controller;

import com.xzit.model.Student;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
@Api(tags = {"学生管理"}) //说明类的作用
public class StudentController {
    @GetMapping("")
    @ApiOperation(value = "显示全部学生数据") //说明方法的作用
    public Object list() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "张三", "男", 20));
        list.add(new Student(2, "李四", "女", 22));
        list.add(new Student(3, "王五", "男", 23));
        list.add(new Student(4, "赵六", "男", 24));
        return list;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "按给定id查询")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id", value = "学生id", required = true, paramType = "path", dataType = "Integer", dataTypeClass = Integer.class)
    )
    public Object selectById(@PathVariable int id) {
        return new Student(id, "赵六", "男", 22);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("按给定id删除学生信息")
    public Object deleteById(@PathVariable int id) {
        return "已删除id为" + id + "的学生";
    }

    @PostMapping()
    @ApiOperation("新增学生")
    public Object save(@ApiParam(name = "student", value = "学生对象") @RequestBody Student student) {
        return student;
    }

    @PutMapping()
    @ApiOperation("更新学生信息")
    public Object pub(@RequestBody Student student) {
        return student;
    }
}
