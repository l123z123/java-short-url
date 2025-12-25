package com.lzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 新增这行：排除数据源自动配置类
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// 关键修改：添加 exclude = DataSourceAutoConfiguration.class
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JavaShortUrlApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaShortUrlApplication.class, args);
    }
}