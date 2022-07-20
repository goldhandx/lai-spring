package com.goldhandx.beans.factory.support;

import com.goldhandx.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 *
 * @author LaiWeiJie
 * @Date 2022/7/20 15:15
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
