package com.model;

import java.io.IOException;

//普通类只能继承一个类
public class SubClass extends BaseClass {
	//如果是以下方法签名会编译错误,因为子类方法声明的异常必须是父类方法声明的异常的子类或相同
	//public void test() throws Exception{
	public void test() throws IOException{
		System.out.println("子类覆盖的test方法!");
	}
	
	public String toString(){
		return "这是SubClass子类,覆盖Object的toString方法";
	}

	public static void main(String[] args) throws IOException  {
		BaseClass bc=new SubClass();
		bc.test();
		System.out.println("分割1");
		SubClass sc=new SubClass();
		sc.test();
		System.out.println("分割2");
		System.out.println(sc);
	}
}
