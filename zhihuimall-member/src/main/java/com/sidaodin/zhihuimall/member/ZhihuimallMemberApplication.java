package com.sidaodin.zhihuimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1 想要远程调用别的服务
 *  1） 引入open-feign
 *  2） 编写一个接口，告诉SpringCloud这个接口需要调用远程服务
 */
@EnableFeignClients(basePackages = "com.sidaodin.zhihuimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ZhihuimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuimallMemberApplication.class, args);
    }

}
