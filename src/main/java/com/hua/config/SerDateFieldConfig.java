package com.hua.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class SerDateFieldConfig implements MetaObjectHandler {

    //创建时间的方法
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("gmtCreated",new Date(),metaObject);

        //为实体类更新时间创建初始化
        this.setFieldValByName("gmtUpdated",new Date(),metaObject);
    }

    //更新时间的方法
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("gmtUpdated",new Date(),metaObject);
    }
}
