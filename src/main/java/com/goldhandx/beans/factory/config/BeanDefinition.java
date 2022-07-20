package com.goldhandx.beans.factory.config;

/**
 * @author LaiWeiJie
 * @Date 2022/7/20 14:50
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

    public Class getBeanClass(){
        return beanClass;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }

}
