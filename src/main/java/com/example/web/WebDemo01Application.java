package com.example.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.example.web") //指定包下扫描
@SpringBootApplication
@MapperScan("com.example.web.mapper")
public class WebDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(WebDemo01Application.class, args);
    }

}
