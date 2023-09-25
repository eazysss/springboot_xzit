package com.xzit.controller;

import com.xzit.model.Users;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UsersController {
    @Resource
    private Users users;
    @Resource
    private Environment env;

    @GetMapping()
    public Object showYaml() {
        return users;
    }

    @GetMapping("/env")
    public Object inv() {
        System.out.println(env.getProperty("sysUser"));
        System.out.println(env.getProperty("age"));
        System.out.println(env.getProperty("money"));
        System.out.println(env.getProperty("birth"));
        return "hello";
    }
}
