package com.ldx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.ldx.springcloud.mapper")
@SpringBootApplication
public class SpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApplication.class, args);
    }

}
