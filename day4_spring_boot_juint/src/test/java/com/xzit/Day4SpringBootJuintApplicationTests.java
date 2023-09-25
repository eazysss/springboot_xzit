package com.xzit;

import com.xzit.entity.Users;
import com.xzit.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Day4SpringBootJuintApplicationTests {
    @Resource
    private UserService service;
    @Test
    void contextLoads() {
        List<Users> list = service.list();
        list.forEach(System.out::println);
    }

}
