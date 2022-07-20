package com.goldhandx.beans.factory.config;

/**
 * 单例注册表
 *
 * @author LaiWeiJie
 * @Date 2022/7/20 15:21
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例bean
     * @param beanName
     * @return object
     */
    Object getSingleton(String beanName);
}
