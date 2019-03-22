package com.ostay;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class FactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("-----调用了BeanFactoryPostProcessor.postProcessBeanFactory()-----");
        String[] beanStr = beanFactory
                .getBeanDefinitionNames();
        for (String beanName : beanStr) {
            if ("beanFactoryPostProcessorTest".equals(beanName)) {
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
                MutablePropertyValues m = beanDefinition.getPropertyValues();
                if (m.contains("name")) {
                    m.addPropertyValue("name", "赵四");
                    System.out.println("-----修改了name属性初始值了-----");
                }
            }
        }
    }
}
