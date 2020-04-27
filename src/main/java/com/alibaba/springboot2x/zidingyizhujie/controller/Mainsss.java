package com.alibaba.springboot2x.zidingyizhujie.controller;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-24
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mainsss {
    public static void main(String[]args){
        List<Integer> alist = new ArrayList<>();

        alist.add(1);

        alist.add(2);

        alist.add(3);

        List<Integer> blist = alist;

        blist.set(1, 1);

        System.out.println(alist.get(1));
    }
}
