package com.zhang.weibo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhang.weibo.mapper")
public class WeiboApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiboApplication.class, args);
    }

}
