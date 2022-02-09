package com.lanqiao.empsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动的引导类
@SpringBootApplication
@MapperScan(basePackages = {"com.lanqiao.empsys.dao"})
public class EmpsysApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpsysApplication.class, args);
    }

}
