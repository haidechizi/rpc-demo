package com.gupaoedu.service;

import com.gupaoedu.entity.User;

public interface IUserService {

    String sayHello(String name);

    User getUser(String name);
}
