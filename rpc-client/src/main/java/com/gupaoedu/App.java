package com.gupaoedu;

import com.gupaoedu.entity.User;
import com.gupaoedu.proxy.RpcProxyClient;
import com.gupaoedu.service.IUserService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        IUserService iUserService = rpcProxyClient.clientProxy(IUserService.class,"127.0.0.1",8080);

        String result = iUserService.sayHello("mic");

        System.out.println(result);

        User user = iUserService.getUser("mic");

        System.out.println(user);
    }
}
