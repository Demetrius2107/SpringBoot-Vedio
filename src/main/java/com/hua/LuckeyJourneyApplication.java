package com.hua;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@EnableAspectJAutoProxy
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.hua.mapper")
@EnableScheduling
public class LuckeyJourneyApplication {

    public static void main(String[] args) {

    }
}
