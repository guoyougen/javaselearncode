package com.se.day23;

import java.io.PrintWriter;
import java.net.Socket;

/**
 * @projectname: javalearncode
 * @packname: com.se.day23
 * @classname: ServerThread
 * @author: gyg
 * @date: 2022/8/8 下午 4:32
 * @version: 1.0
 * @description:
 */

public class ServerThread extends Thread {
    private Socket clientSocket;

    public ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        String hello = "你好";
        try (PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
            writer.println(hello);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
