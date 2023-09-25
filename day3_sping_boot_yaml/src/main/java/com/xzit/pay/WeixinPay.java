package com.xzit.pay;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class WeixinPay implements PayMent{
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
