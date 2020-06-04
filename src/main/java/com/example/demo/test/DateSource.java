package com.example.demo.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author loryi
 */
@Component
public class DateSource {

    @Resource
    private DruidDataSource dataSource;



}
