package com.ldx.springcloud.controller;

import com.ldx.springcloud.entity.User;
import com.ldx.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/blog")
@RestController
public class SayHello {
    @Autowired
    UserService userService;

    @RequestMapping("/sayHello")
    public String hello(){
        User user =userService.getUser();
        System.out.println(user.getName());
        return user.getName();
    }
}
