package com.alibaba.springboot2x;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-17
 */


import com.alibaba.springboot2x.mybatiszhenghe.entity.User;
import com.alibaba.springboot2x.mybatiszhenghe.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.PreparedStatement;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2xApplicationTest {

    Logger logger= LoggerFactory.getLogger(Springboot2xApplicationTest.class);

    UserService userService;

    @Autowired
    public Springboot2xApplicationTest(UserService userService) {
        this.userService = userService;
    }


    @Test
    public void testMyBatis(){
        List<User> userList = userService.findByName("wly");
        logger.info("依据用户名 查询--[{}]",userList);
    }

    @Test
    public void testSet(){
        Map<String, String> map = new HashMap<>();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.forEach((entry)->{
            System.out.println(entry.getValue());
        });

        map.forEach((k,v)->{
            System.out.println(k+""+v);
        });

    }
}
