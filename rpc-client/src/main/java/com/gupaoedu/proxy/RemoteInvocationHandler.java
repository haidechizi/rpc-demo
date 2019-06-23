package com.gupaoedu.proxy;

import com.gupaoedu.entity.RpcRequest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RemoteInvocationHandler implements InvocationHandler {

    private String host;
    private int port;

    public RemoteInvocationHandler(String host,int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        RpcRequest rpcRequest = new RpcRequest();
        String className = method.getDeclaringClass().getName();
        String methodName = method.getName();
        rpcRequest.setClassName(className);
        rpcRequest.setMethodName(methodName);
        rpcRequest.setParameters(args);
        System.out.println("hello");

        TransportHandler transportHandler = new TransportHandler(host,port);

        Object result = transportHandler.send(rpcRequest);

        return result;
    }
}
