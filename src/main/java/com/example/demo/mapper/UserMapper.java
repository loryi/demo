package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author loryi
 */
@Mapper
public interface UserMapper {

    User findUserById(String userId);

    int addUser(User user);

}
