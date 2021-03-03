package com.lanxin.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(loadbalance = "roundrobin")
@Component
public class UserServiceImpl implements UserService{

    public String hello(String name) {
        return "hello "+name;
    }
}
