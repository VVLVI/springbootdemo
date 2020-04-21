package com.alibaba.springboot2x.peizhifile;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-16
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//配置文件  默认的基础路径就是  classpath:，所以
//@PropertySource("user.properties")q
//@ConfigurationProperties
@ToString
@Component
@PropertySource("user.properties")
@ConfigurationProperties(prefix = "wly")
@Getter
@Setter
public class User {
    private String name;
    private String pass;
    private String email;
}
