package com.javaclimb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.javaclimb.mapper")
@SpringBootApplication
public class WxshopbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxshopbackApplication.class, args);
    }

}
