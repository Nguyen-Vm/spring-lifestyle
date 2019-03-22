package com.ostay;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://www.cnblogs.com/sishang/p/6588542.html
 */
public class SpringLifestyleTest {

    ApplicationContext applicationContext = null;

    @Before
    public void before() {
        System.out.println("-----Spring ApplicationContext容器开始初始化了-----");
        applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("-----Spring ApplicationContext容器初始化完毕了-----");
    }

    @Test
    public void test() {
        BeanFactoryPostProcessorTest beanFactoryPostProcessorTest = applicationContext.getBean(BeanFactoryPostProcessorTest.class);
        System.out.println(beanFactoryPostProcessorTest.toString());
    }
}
