package com.alibaba.springboot2x.zidingyizhujie.controller;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-23
 */



import com.alibaba.springboot2x.zidingyizhujie.AnnotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ac")
public class AnnotationController {

    private static final Logger logger=LoggerFactory.getLogger(AnnotationController.class);

    @Autowired
    AnnotationService as;

    @GetMapping("/as")
    public AnnotationService testAnnotation(){
        logger.info("具体内容：："+as.toString());
        return as;
    }
}
