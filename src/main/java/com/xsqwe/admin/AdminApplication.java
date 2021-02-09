package com.xsqwe.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@MapperScan("com.xsqwe.admin.mapper")
public class AdminApplication  {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

    // 打war 包
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(AdminApplication.class);
//    }
}
