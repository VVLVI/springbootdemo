package com.alibaba.springboot2x.swaggerzhenghe.pojo;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-21
 */


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;


@ApiModel
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

    @ApiModelProperty("用户ID ，数据库自增主键")
    private Long id;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("密码")
    private String pass;
}
