package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AdminClientApplication
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2019/4/29 15:43
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class AdminClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminClientApplication.class,args);
    }
}
