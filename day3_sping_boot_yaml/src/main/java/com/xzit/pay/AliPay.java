package com.xzit.pay;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class AliPay implements PayMent{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
