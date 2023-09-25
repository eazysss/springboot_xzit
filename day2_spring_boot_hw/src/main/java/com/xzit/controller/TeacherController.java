package com.xzit.controller;

import com.xzit.model.Teacher;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("teacher")
@Api(tags = {"教师管理系统"})
public class TeacherController {
    @PostMapping()
    @ApiOperation(value = "新增教师")
    public Object save(@RequestBody Teacher teacher) {
        return teacher;
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除教师")
    public Object delete(@ApiParam(name = "id", value = "教师id") @PathVariable int id) {
        return "已删除id为" + id + "的教师";
    }

    @PutMapping()
    @ApiOperation(value = "更新教师信息")
    public Object put(@RequestBody Teacher teacher) {
        return teacher;
    }

    @GetMapping()
    @ApiOperation(value = "查询全部教师信息")
    public Object list() {
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher(1, "李白", 40, "男"));
        list.add(new Teacher(2, "杜甫", 38, "男"));
        list.add(new Teacher(3, "李商隐", 45, "女"));
        list.add(new Teacher(4, "李清照", 45, "女"));
        return list;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "按照id查询教师")
    public Object selectById(@ApiParam(name = "id", value = "教师id") @PathVariable int id) {
        return new Teacher(id,"苏轼", 41, "男");
    }
}
