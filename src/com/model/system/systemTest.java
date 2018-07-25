package com.model.system;

import java.io.IOException;
import java.util.Map;

public class systemTest {

	public static void main(String[] args) throws IOException {
		Map<String,String> map=System.getenv();
		for(String key:map.keySet()){
			System.out.println(key+"---------->"+map.get(key));
		}
		
		System.out.println(System.getProperty("os.name"));
		
		//毫秒为单位
		System.out.println(System.currentTimeMillis());
		//微秒为单位
		System.out.println(System.nanoTime());
		
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器数量:"+rt.availableProcessors());
		System.out.println("空闲内存:"+rt.freeMemory());
		System.out.println("总内存数:"+rt.totalMemory());
		System.out.println("可用最大内存数:"+rt.maxMemory());
		
		//运行操作系统命令
		  
		rt.exec("notepad.exe");
		
	}
	
}
