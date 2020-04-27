package com.alibaba.springboot2x.mybatiszhenghe.service.impl;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-17
 */


import com.alibaba.springboot2x.mybatiszhenghe.dao.UserMapper;
import com.alibaba.springboot2x.mybatiszhenghe.entity.User;
import com.alibaba.springboot2x.mybatiszhenghe.service.UserService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findByName(String userName) {
//        return userMapper.findByName(userName);
        List<User> userList=new ArrayList<>();
        userList.add(new User(1L,"wly","123456"));
        return userMapper.findByName(userName);

    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
