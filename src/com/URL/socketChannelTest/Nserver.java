package com.URL.socketChannelTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class Nserver {
	private Selector selector;
	private Charset charset=Charset.forName("UTF-8");
	
	public void init() throws IOException{
		selector=Selector.open();
		ServerSocketChannel server=ServerSocketChannel.open();
		InetSocketAddress isa=new InetSocketAddress("127.0.0.1", 30001);
		//将该ServerSocketChannel绑定到指定ip
		server.socket().bind(isa);
		//设置为非阻塞通讯
		server.configureBlocking(false);
		server.register(selector, SelectionKey.OP_ACCEPT);
		
		while(selector.select()>0){
			for(SelectionKey sk:selector.selectedKeys()){
				//sk对应的通道包含客户端的连接请求
				if(sk.isAcceptable()){
					//接受连接,生成服务器端对应的SocketChannel
					SocketChannel sc=server.accept();
					sc.configureBlocking(false);
					//将SocketChannel注册到Selector
					sc.register(selector, SelectionKey.OP_READ);
					//注册完sc之后,将sk设置成准备接受其他请求的状态
					sk.interestOps(SelectionKey.OP_ACCEPT);
				}
				//是否有数据读取
				if(sk.isReadable()){
					//获取该SelectionKey对应的Channel
					//(注意和上边代码30行的SocketChannel是有区别的,上边的SocketChannel是生成和此SocketChannel对应服务端的SocketChannel)
					SocketChannel sc=(SocketChannel) sk.channel();
					
					ByteBuffer bb=ByteBuffer.allocate(1024);
					String content="";
					
					try {
						while(sc.read(bb)>0){
							//准备输出数据
							bb.flip();
							content+=charset.decode(bb);
						}
						//读取完channel的数据之后,将sk设置成准备下一次读取
						sk.interestOps(SelectionKey.OP_READ);
					} catch (Exception e) {
						//从Selector中删除指定的SelectionKey
						sk.cancel();
						if(sk.channel()!=null){
							sk.channel().close();
						}
					}
					
					//将数据写入所有在Selector上注册的channel
					if(content.length()>0){
						//遍历selector所有SelectionKey
						for(SelectionKey key:selector.keys()){
							Channel channel=key.channel();
							//判断此channel是不是客户端channel
							if(channel instanceof SocketChannel){
								SocketChannel dest=(SocketChannel) channel;
								dest.write(charset.encode(content));
							}
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Nserver().init();
	}
}
