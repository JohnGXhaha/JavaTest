package com.test;

public class testFinalize {
	private static testFinalize tf=null;
	
	public void info(){
		System.out.println("测试垃圾回收finalze方法时效");
	}
	public static void main(String[] args) throws Throwable {
		new testFinalize();
		//调用垃圾回收器(什么时候调用finalize不知道)
		System.gc();
		Runtime.getRuntime().gc();
//		Thread.sleep(1000);
		//调用垃圾回收器(立即调用finalize方法)
		System.runFinalization();
		Runtime.getRuntime().runFinalization();
		tf.info();
	}
	
	public void finalize(){
		tf=this;
	}
}
