package com.alibaba.springboot2x.interceptoruse;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-23
 */


import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

import java.util.Properties;

public class MyInterceptor implements Interceptor {

    /*
          对某个方法的拦截，拦截以后进行处理，，也就是增强。

     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
//        invocation=new Invocation();
        System.out.println("  .   ____          _            __ _ _\n" +
                " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\\n" +
                "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\\n" +
                " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )\n" +
                "  '  |____| .__|_| |_|_| |_\\__, | / / / /\n" +
                " =========|_|==============|___/=/_/_/_/\n" +
                " :: Spring Boot ::        (v2.2.6.RELEASE)\n" +
                " 《《《   就是在放屁。。。。MD==========》》》真的是！\n" +
                " ===============================================\n" +
                " 进入了拦截器。。。\n" +
                " +++++++++++++++++++++++++++++++++++++++++++++++");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
