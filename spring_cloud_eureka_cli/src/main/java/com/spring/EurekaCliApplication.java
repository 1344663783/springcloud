package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName EurekaCliApplication
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2019/4/26 18:11
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class EurekaCliApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCliApplication.class,args);
    }
}
