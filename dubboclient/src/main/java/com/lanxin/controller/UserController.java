package com.lanxin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lanxin.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("sayHello")
    public String sayHello(String name){
            return userService.hello(name);
    }
}
