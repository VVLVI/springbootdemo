package com.alibaba.springboot2x.mybatiszhenghe.controller;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-17
 */


import com.alibaba.springboot2x.mybatiszhenghe.entity.User;
import com.alibaba.springboot2x.mybatiszhenghe.service.UserService;
import com.alibaba.springboot2x.mybatiszhenghe.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
restController  就是  responseBody  +   Controller
 */
@RestController
@RequestMapping("/mybatis")
public class MyBtaisController {


    /*
        Autowired自动注入这个类
        QUalifier指明  这个类的对象的名字，
        这里 把 impl类打了 @service注解标签
        所以 注入的是 impl对象
     */
    @Autowired
    @Qualifier("userServiceImpl")
    UserService userService;

    @GetMapping("/show")
    public List<User> getByName(@RequestParam("userName") String userName){
        List<User> userList = userService.findByName(userName);
        return userList;
    }

    @GetMapping("/insert")
    public int insert(){
        User user = new User();
        user.setUserName("wlq王五");
        user.setPassword("165453");
        return userService.insertUser(user);
    }
}
