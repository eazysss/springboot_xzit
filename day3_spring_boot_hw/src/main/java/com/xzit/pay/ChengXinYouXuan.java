package com.xzit.pay;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class ChengXinYouXuan implements PayMent{
    @Override
    public void pay() {
        System.out.println("使用橙心优选");
    }
}
