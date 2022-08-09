package com.se.day23;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: SimpleServer
 * @author: gyg
 * @date: 2022/8/8 下午 4:27
 * @version: 1.0
 * @description:
 */

public class SimpleServer {
    public static void main(String[] args) {
        SimpleServer ss = new SimpleServer();
        ss.start();
    }

    private void start() {
        int port = 17888;
        try (ServerSocket ss = new ServerSocket(port);) {
            System.out.printf("监听 %s端口\n", port);
            Socket client = ss.accept();
            System.out.printf("有%s的客户端连接\n", client.getInetAddress().getHostAddress());
            new ServerThread(client).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
