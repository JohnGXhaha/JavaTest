package com.URL.socketChannelTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;


public class Nclient {
	private Selector selector;
	private Charset charset=Charset.forName("UTF-8");
	private SocketChannel sc;
	
	public static void main(String[] args) throws IOException {
		new Nclient().init();
	}
	
	public void init() throws IOException {
		selector=Selector.open();
		InetSocketAddress isa=new InetSocketAddress("127.0.0.1", 30001);
		sc=SocketChannel.open(isa);
		//设置为非阻塞通讯
		sc.configureBlocking(false);
		sc.register(selector, SelectionKey.OP_READ);
		
		new ClientThread().start();
		Scanner scan=new Scanner(System.in);
		while(scan.hasNextLine()) {
			String line=scan.nextLine();
			sc.write(charset.encode(line));
		}
		
	}
	
	//内部类
	private class ClientThread extends Thread{
		public void run() {
			try {
				while(selector.select()>0) {
					for(SelectionKey sk:selector.selectedKeys()) {
						selector.selectedKeys().remove(sk);
						if(sk.isReadable()) {
							SocketChannel sc=(SocketChannel) sk.channel();
							ByteBuffer bb=ByteBuffer.allocate(1024);
							String content="";
							while(sc.read(bb)>0){
								sc.read(bb);
								//准备输出数据
								bb.flip();
								content+=charset.decode(bb);
							}
							System.out.println("client: "+content);
							sk.interestOps(SelectionKey.OP_READ);
						}
					}
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
