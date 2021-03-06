package com.spring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-eureka-cli",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
