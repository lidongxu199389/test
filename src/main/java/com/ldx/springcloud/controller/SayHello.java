package com.ldx.springcloud.controller;

import com.ldx.springcloud.base.config.vo.ResultModel;
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
    public ResultModel hello(){
        User user =userService.getUser();
        System.out.println("resultCode");
        ResultModel resultModel =  new ResultModel();
        resultModel.setResult(user);
        return resultModel;
    }
}
