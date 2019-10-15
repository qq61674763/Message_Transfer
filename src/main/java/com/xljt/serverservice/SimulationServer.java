package com.xljt.serverservice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: messagetransfer
 * @description: 服务端
 * @author: xu
 * @date: 2019-10-14 13:57
 **/
public class SimulationServer {

    public static void main(String[] args) throws Exception {
        //服务端在20006端口监听客户端请求的TCP连接
        ServerSocket server = new ServerSocket(20006);
        Socket client = null;
        boolean f = true;
        while (f) {
            //等待客户端的连接，如果没有获取连接
            client = server.accept();
            System.out.println("与客户端连接成功！" + client.getInetAddress().getLocalHost());
            //为每个客户端连接开启一个线程
            new Thread(new ServerThread(client)).start();

            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            //读取客户端发送来的消息
            String mess = br.readLine();
            System.out.println("客户端："+mess);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            bw.write(mess+"\n");
            bw.flush();
        }
        server.close();
    }
}
