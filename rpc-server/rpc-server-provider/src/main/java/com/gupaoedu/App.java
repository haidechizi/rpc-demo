package com.gupaoedu;

import com.gupaoedu.service.IUserService;
import com.gupaoedu.service.impl.UserServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        IUserService iUserService = new UserServiceImpl();

        RpcServicePublish rpcServicePublish = new RpcServicePublish();
        rpcServicePublish.publish(iUserService, 8080);
    }
}
