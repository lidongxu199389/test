package com.ldx.springcloud.service.impl;

import com.ldx.springcloud.entity.User;
import com.ldx.springcloud.mapper.UserMapper;
import com.ldx.springcloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public User getUser() {
        return userMapper.getUser();
    }
}
