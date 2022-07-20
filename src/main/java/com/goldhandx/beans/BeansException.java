package com.goldhandx.beans;

/**
 * @author LaiWeiJie
 * @Date 2022/7/20 15:51
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
