package com.nrsc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启事务功能
//@EnableAspectJAutoProxy //开启AOP功能
public class MybatisSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringbootApplication.class, args);
    }
}
