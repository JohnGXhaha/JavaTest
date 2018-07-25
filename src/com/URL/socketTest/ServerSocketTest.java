package com.URL.socketTest;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
//服务端
public class ServerSocketTest {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket=new ServerSocket(30002);
		while(true){
			//接收客户端socket请求
			Socket socket = null;
			PrintStream ps = null;
			try {
				socket = serverSocket.accept();
				System.out.println(socket.isConnected());
				ps = new PrintStream(socket.getOutputStream());
				ps.println("傻逼你好111!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				ps.flush();
				ps.close();
				socket.close();
			}
			
		}
		
	}
}
