package com.alibaba.springboot2x.thymeleafzhenghe.controller;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-16
 */



import com.alibaba.springboot2x.peizhifile.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/th")
public class ThymeleafController {

    final User user;//这个user,采用自动注入，因为 user类 打上了 @Component标签

    //而springboot官方  推荐  属性注入---构造器注入
    @Autowired
    public ThymeleafController(User user) {
        this.user = user;
    }

    @GetMapping("/index1")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("index");
        System.out.println(user);
        // 设置属性
        view.addObject("title", "我的第一个WEB页面");
        view.addObject("desc", "欢迎进入battcn-web 系统");
        view.addObject("user",user);
        return view;
    }

    @GetMapping("/indexs")
    public String index(HttpServletRequest request){
        request.setAttribute("title","王利勇的Thymeleaf页面");
        request.setAttribute("desc","欢迎来到 旅游景点  管理系统");
        request.setAttribute("user",user);
        //DispatcherServlet，默认拼接  /resources/template/+xxxx+.html
        return "index";
    }

}
