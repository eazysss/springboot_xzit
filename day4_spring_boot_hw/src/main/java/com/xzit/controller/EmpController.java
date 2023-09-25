package com.xzit.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Emp;
import com.xzit.service.EmpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("emp")
@Api(tags = {"员工管理系统"})
public class EmpController {
    @Resource
    private EmpService service;

    @PostMapping()
    @ApiOperation("添加员工信息")
    public Object insert(@RequestBody Emp emp) {
        return service.save(emp);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除给定id员工")
    public Object deleteById(@PathVariable Integer id) {
        return service.deleteId(id);
    }

    @PutMapping("/{id}")
    @ApiOperation("修改员工信息")
    public Object update(@RequestBody Emp emp, @PathVariable Integer id) {
        return service.update(emp);
    }

    @GetMapping()
    @ApiOperation("查询全部员工信息")
    public Object selectList() {
        return service.selectList();
    }

    @GetMapping("/{id}")
    @ApiOperation("查询给定id员工信息")
    public Object selectById(@PathVariable Integer id) {
        return service.selectById(id);
    }

    @GetMapping("/{start}/{size}")
    @ApiOperation("分页查询员工信息")
    public Object selectByPage(@PathVariable Integer start, @PathVariable Integer size) {
        PageHelper.startPage(start, size);
        List<Emp> list = service.selectList();
        return new PageInfo<>(list);
    }
}
