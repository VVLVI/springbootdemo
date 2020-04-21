package com.alibaba.springboot2x;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-17
 */


import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//在这个包下，扫描所有的注解类。
@ComponentScan(basePackages = {"com.alibaba.springboot2x.*"})
//在这个路径下，扫描所有的mapper文件
@MapperScan(basePackages = {"com.alibaba.springboot2x.mybatiszhenghe.dao"})
public class springboot2xApplication {


    /*
        这是  springboot的启动类，启动之后
        按照 application.properties的配置进行访问
        localhost:8083/springbootdemo/controller映射/方法映射
        localhost:8083/springbootdemo/swagger/qry
     */
    public static void main(String[]args){
        SpringApplication.run(springboot2xApplication.class,args);
    }
}
