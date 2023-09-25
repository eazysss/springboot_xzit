package com.xzit.service.impl;

import com.xzit.entity.Emp;
import com.xzit.mapper.EmpMapper;
import com.xzit.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper mapper;

    @Override
    public int save(Emp emp) {
        return mapper.save(emp);
    }

    @Override
    public int deleteId(Integer id) {
        return mapper.deleteId(id);
    }

    @Override
    public int update(Emp emp) {
        return mapper.update(emp);
    }

    @Override
    public List<Emp> selectList() {
        return mapper.selectList();
    }

    @Override
    public Emp selectById(Integer id) {
        return mapper.selectById(id);
    }
}
