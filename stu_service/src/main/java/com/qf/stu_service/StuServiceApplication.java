package com.qf.stu_service;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan(basePackages = "com.qf.dao")
@DubboComponentScan("com.qf.serviceimpl")
public class StuServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StuServiceApplication.class, args);
    }
}
