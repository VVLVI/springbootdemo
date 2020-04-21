package com.alibaba.springboot2x.mybatiszhenghe.service;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-17
 */




import com.alibaba.springboot2x.mybatiszhenghe.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findByName(String userName);

    /*
        0 失败
        1 成功
     */
    int insertUser(User user);
}
