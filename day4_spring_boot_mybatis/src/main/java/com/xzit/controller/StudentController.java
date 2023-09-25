package com.xzit.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Student;
import com.xzit.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("student")
@Api(tags = {"学生管理系统"})
public class StudentController {
    @Resource
    private StudentService service;

    @ApiOperation("分页显示学生信息")
    @GetMapping("/{start}/{size}")
    public Object listByPage(@PathVariable Integer start, @PathVariable Integer size) {
        PageHelper.startPage(start, size);
        List<Student> list = service.selectList();
        return new PageInfo<>(list);
    }

    @GetMapping()
    @ApiOperation("显示全部学生信息")
    public Object list() {
        List<Student> list = service.selectList();
        return list;
    }
    @GetMapping("/{id}")
    @ApiOperation("按给定id查找学生信息")
    public Object selectId(@PathVariable Integer id) {
        return service.selectId(id);
    }

    @PostMapping()
    @ApiOperation("保存学生信息")
    public Object save(@RequestBody Student student) {
        return service.save(student);
    }

    @PutMapping()
    @ApiOperation("修改学生信息")
    public Object update(@RequestBody Student student) {
        return service.update(student);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("按给定id删除学生信息")
    public Object delete(@PathVariable Integer id) {
        return service.delete(id);
    }
}
