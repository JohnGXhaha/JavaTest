package com.classTest;

public class test {
	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader cl=ClassLoader.getSystemClassLoader();
		//编译(仅加载)
		cl.loadClass("com.Class.ClassTest");
		//初始化
		Class.forName("com.Class.ClassTest");
	}
}
