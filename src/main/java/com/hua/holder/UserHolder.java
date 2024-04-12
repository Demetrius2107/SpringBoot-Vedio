package com.hua.holder;

import java.util.Objects;

public class UserHolder {

    private static ThreadLocal<Long> userThreadLocal = new ThreadLocal<>();

    //添加E
    public static void set(Object id){
        userThreadLocal.set(Long.valueOf(id.toString()));
    }

    //获取
    public static Long get(){
        return userThreadLocal.get();
    }

    //删除
    public static void clear(){
        userThreadLocal.remove();
    }
}
