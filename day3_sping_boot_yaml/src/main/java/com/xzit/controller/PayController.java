package com.xzit.controller;

import com.xzit.pay.PayMent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("pay")
public class PayController {
    @Resource
    private PayMent payMent;

    @GetMapping()
    public Object pay() {
        payMent.pay();
        return "OK";
    }
}

