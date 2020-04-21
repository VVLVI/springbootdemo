package com.alibaba.springboot2x.mybatiszhenghe.dao;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-17
 */


import com.alibaba.springboot2x.mybatiszhenghe.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from t_user where user_name=#{userName}")
    List<User> findByName(@Param("userName") String userName);

    /*
        0 失败
        1 成功
     */
    int insertUser(User user);
}
