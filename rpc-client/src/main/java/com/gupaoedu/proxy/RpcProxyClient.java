package com.gupaoedu.proxy;

import java.lang.reflect.Proxy;

public class RpcProxyClient {

    public <T> T clientProxy(Class<?> clazz, String host, int port) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, new RemoteInvocationHandler(host,port));
    }
}
