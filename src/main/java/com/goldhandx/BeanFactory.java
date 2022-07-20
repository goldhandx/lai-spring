package com.goldhandx;

import com.goldhandx.beans.BeansException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LaiWeiJie
 * @Date 2022/7/20 11:43
 */
public interface BeanFactory {
    /**
     * 获取bean
     *
     * @param name
     * @return
     * @throws BeansException bean不存在时
     */
    Object getBean(String name) throws BeansException;
}
