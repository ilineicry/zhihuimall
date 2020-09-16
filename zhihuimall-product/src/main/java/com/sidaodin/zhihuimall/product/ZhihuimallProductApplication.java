package com.sidaodin.zhihuimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.sidaodin.zhihuimall.product.dao")
@SpringBootApplication
public class ZhihuimallProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZhihuimallProductApplication.class, args);
    }

}
