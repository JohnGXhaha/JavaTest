package com.classTest;

public class test {
	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader cl=ClassLoader.getSystemClassLoader();
		//����(������)
		cl.loadClass("com.Class.ClassTest");
		//��ʼ��
		Class.forName("com.Class.ClassTest");
	}
}
