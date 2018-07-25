package com.newIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
//新io
public class ChannelTest {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			File f=new File("g:/1.txt");
			FileChannel inChannel=new FileInputStream(f).getChannel();
			ByteBuffer bbin=inChannel.map(FileChannel.MapMode.READ_ONLY, 0,f.length());
			
			
			FileChannel outChannel=new FileOutputStream("g:/a.txt").getChannel();
			outChannel.write(bbin);
			
			bbin.clear();
			
			Charset charset=Charset.forName("GBK");
			//创建解码器
			CharsetDecoder charsetDecoder=charset.newDecoder();
			//使用解码器将butebuffer转换成charbuffer
			CharBuffer charBuffer=charsetDecoder.decode(bbin);
			System.out.println(charBuffer);
			//当前操作系统使用的编码方式
			System.out.println(System.getProperty("file.encoding"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
