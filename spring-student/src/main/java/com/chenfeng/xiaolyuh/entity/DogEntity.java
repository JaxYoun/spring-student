package com.chenfeng.xiaolyuh.entity;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
public class DogEntity {
    public String say() {
        return "Hello!" + this.getClass().getName();
    }
}