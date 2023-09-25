package com.xzit.controller;

import com.xzit.service.TeamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("team")
@Api(tags = {"团队管理"})
public class TeamController {
    @Resource
    private TeamService service;
    @GetMapping()
    @ApiOperation("显示团队信息")
    public Object list() {
        return service.selectList();
    }
}
