package com.xzit.service.impl;

import com.xzit.entity.Team;
import com.xzit.mapper.TeamMapper;
import com.xzit.service.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Resource
    private TeamMapper mapper;

    @Override
    public List<Team> selectList() {
        return mapper.selectList();
    }
}
