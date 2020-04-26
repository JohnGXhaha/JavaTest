package com.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"的i值为"+i);
		}
	}
	
	public static void main(String[] args) {
		ExecutorService exeService=Executors.newCachedThreadPool();
		
		exeService.submit(new ThreadPoolTest());
		exeService.submit(new ThreadPoolTest());
		
		exeService.shutdown();
		
		System.out.println(exeService.isShutdown());//先关闭线程池,然后执行关闭之前放入池中的线程
	}
}
