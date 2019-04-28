package com.spring.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName AdminServiceHystrix
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2019/4/28 13:50
 * @Version 1.0
 **/
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
