package com.ostay;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanFactoryPostProcessorTest implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware {

    private String name;

    private String sex;

    // BeanFactoryAware
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("-----调用了BeanFactoryAware的setBeanFactory方法了-----");
    }

    // BeanNameAware
    public void setBeanName(String s) {
        System.out.println("-----调用了BeanNameAware的setBeanName方法了-----");
    }

    // DisposableBean
    public void destroy() throws Exception {
        System.out.println("-----调用了DisposableBean的destroy方法了-----");
    }

    // InitializingBean
    public void afterPropertiesSet() throws Exception {
        System.out.println("-----调用了InitializingBean的afterPropertiesSet方法了-----");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "BeanFactoryPostProcessorTest{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
