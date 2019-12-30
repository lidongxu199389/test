package com.ldx.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
public class SayHello {
    @RequestMapping("/sayHello")
    public String hello(){
        String s = "Hello,SpringBoot!";
        return s;
    }
}
