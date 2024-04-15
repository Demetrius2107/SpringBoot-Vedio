package com.hua.authority;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Authority {

    /**
     * 权限标识
     * @return
     */
    String[] value();

    Class verify() default DefaultAuthorityVerify.class;
}
