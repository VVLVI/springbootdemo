package com.alibaba.springboot2x.mybatiszhenghe.entity;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-17
 */
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = 8655851615465363473L;
    private Long id;
    private String userName;
    private String password;


}
