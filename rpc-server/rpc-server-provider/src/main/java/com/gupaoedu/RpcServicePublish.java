package com.gupaoedu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RpcServicePublish {

    ExecutorService executorService = Executors.newCachedThreadPool();

    public void publish(Object service, int port) {

        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket(port);

            System.out.println("服务启动成功");

            while (true) {
                Socket socket = serverSocket.accept();
                executorService.submit(new ProcessorHandler(service,socket));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
