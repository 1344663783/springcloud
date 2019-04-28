package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2019/4/28 11:19
 * @Version 1.0
 **/
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi (String message){
        return restTemplate.getForObject("http://spring-cloud-eureka-cli/user?message="+message,String.class);
    }

}
