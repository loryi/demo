package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IDemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoService implements IDemoService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findUser(String userid){
        return userMapper.findUserById(userid);
    }

}
