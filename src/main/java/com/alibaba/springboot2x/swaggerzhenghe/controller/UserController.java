package com.alibaba.springboot2x.swaggerzhenghe.controller;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-21
 */


import com.alibaba.springboot2x.swaggerzhenghe.pojo.User;
import com.battcn.swagger.properties.ApiDataType;
import com.battcn.swagger.properties.ApiParamType;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
@Api(tags = "1.1", value = "用户管理")
public class UserController {
    private static final Logger logger= LoggerFactory.getLogger(UserController.class);


    @GetMapping("/qry")
    @ApiOperation(value = "使用  用户名和密码联袂查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value = "用户名",dataType = ApiDataType.STRING,paramType = ApiParamType.QUERY),
            @ApiImplicitParam(name="pass",value = "密码",dataType = ApiDataType.STRING,paramType = ApiParamType.QUERY)
    })

//    在这里，前端过来的数据，直接封装成 User对象
    public User queryUser(User user){
        user.setId(100L);
        logger.info("用户名+密码一起查找{d}"+user.toString());
        return user;
    }

}
