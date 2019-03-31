package com.example.demo.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DateSource {

    @Resource
    private DruidDataSource dataSource;



}
