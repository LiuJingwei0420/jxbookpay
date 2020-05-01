package com.yzu.jxbookpay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yzu.jxbookpay.dao")
public class JxbookpayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxbookpayApplication.class, args);
    }

}
