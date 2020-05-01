package com.yzu.jxbookpay.service.impl;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.yzu.jxbookpay.JxbookpayApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;


public class PayServiceTest extends JxbookpayApplicationTests {

    @Autowired
    private PayService payService;

    @Test
    public void create() {
        payService.create("15295730265", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
    }
}