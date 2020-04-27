package com.alibaba.springboot2x.zidingyizhujie;/*
 *@Description
 *@auther  lenovo
 *@create 2020-04-23
 */


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

public class MyBeanDefinationRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    /*
        当所有的，BeanDefination 都被注册到  BeanDefinatiionRegistry中以后，
        会对  BeanDefinationRegistry对象  进行传递处理。
        在postProceessBeanDefinationRegistry方法中，可以加入对自定义的标签的扫描
        通过，，ClassPathBeanDefinitionScanner   进行注解类扫描
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
        scanner.addIncludeFilter(new AnnotationTypeFilter(WLY.class));
        scanner.scan("com.alibaba.springboot2x.zidingyizhujie");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
