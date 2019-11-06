package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.offcn.mapper")
public class Springbootdemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo02Application.class, args);
    }

}
