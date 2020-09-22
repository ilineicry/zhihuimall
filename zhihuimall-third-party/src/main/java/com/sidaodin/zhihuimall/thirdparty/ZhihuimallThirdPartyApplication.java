package com.sidaodin.zhihuimall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZhihuimallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuimallThirdPartyApplication.class, args);
    }

}
