package com.alibaba.springboot2x.zidingyizhujie;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-23
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@WLY
@Getter
@Setter
@ToString
public class AnnotationService{
    String name="wly王利勇";
    Long id=12L;
}
