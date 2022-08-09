package com.se.day23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: SimpleClient
 * @author: gyg
 * @date: 2022/8/8 下午 4:40
 * @version: 1.0
 * @description:
 */

public class SimpleClient {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 17888;
        try (Socket socket = new Socket(host, port);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("连接成功");
            String line = br.readLine();
            System.out.printf("回复为 %s\n", line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}