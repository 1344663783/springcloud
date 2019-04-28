package com.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName User
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2019/4/28 10:58
 * @Version 1.0
 **/
@RestController
public class User {

    @Value("${server.port}")
    private String port;

    @GetMapping("user")
    public String user(String message){
        return message+"--"+port;
    }
}
