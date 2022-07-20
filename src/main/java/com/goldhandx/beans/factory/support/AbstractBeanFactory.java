package com.goldhandx.beans.factory.support;

import com.goldhandx.BeanFactory;
import com.goldhandx.beans.BeansException;
import com.goldhandx.beans.factory.config.BeanDefinition;

/**
 * @author LaiWeiJie
 * @Date 2022/7/20 15:41
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);

        return createBean(name,beanDefinition);
    }

    protected abstract Object createBean(String bean,BeanDefinition beanDefinition) throws BeansException;


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
