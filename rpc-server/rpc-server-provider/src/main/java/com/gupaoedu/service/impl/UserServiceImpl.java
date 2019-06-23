package com.gupaoedu.service.impl;

import com.gupaoedu.entity.User;
import com.gupaoedu.service.IUserService;

public class UserServiceImpl implements IUserService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

    @Override
    public User getUser(String name) {
        User user = new User(name);
        return user;
    }
}
