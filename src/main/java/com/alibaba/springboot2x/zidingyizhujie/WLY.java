package com.alibaba.springboot2x.zidingyizhujie;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-23
 */

import org.mybatis.spring.mapper.ClassPathMapperScanner;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

import  java.lang.annotation.*;

/*

通过，查看 @Component和 @Service  @Controller  @Configuration注解
我们可以明确的发现，他们都有  @Component注解
而 @Component 注解  主要是利用了  @Indexed注解
 */
@Target({ElementType.CONSTRUCTOR,ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface  WLY {
    String value() default "";
//    ClassPathMapperScanner
//    MapperScannerConfigurer
}
