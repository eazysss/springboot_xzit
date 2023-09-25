package com.xzit.service;

import com.xzit.entity.Emp;

import java.util.List;

public interface EmpService {
    int save(Emp emp);

    int deleteId(Integer id);

    int update(Emp emp);

    List<Emp> selectList();

    Emp selectById(Integer id);
}
