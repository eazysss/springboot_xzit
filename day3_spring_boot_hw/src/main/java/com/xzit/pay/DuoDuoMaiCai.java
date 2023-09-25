package com.xzit.pay;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class DuoDuoMaiCai implements PayMent{
    @Override
    public void pay() {
        System.out.println("使用多多买菜");
    }
}
