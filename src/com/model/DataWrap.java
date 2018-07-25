package com.model;

public class DataWrap {
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void swap(DataWrap dw){
		int tmp=dw.a;
		dw.a=dw.b;
		dw.b=tmp;
		System.out.println("栈内存中复制的dw变量 swap1 "+dw.a+","+dw.b);
		dw=null;
		System.out.println("栈内存中复制的dw变量指向被切断 swap2 "+dw);
	}
	
	public static void main(String[] args) {
		DataWrap dw=new DataWrap();
		dw.a=6;
		dw.b=9;
		//调用下面的方法的时候,复制的是dw变量,操作的是同一个DataWrap对象,故a和b的数据会做出改变
		dw.swap(dw);
		System.out.println("main 栈内存中原始dw变量依然指向堆内存的DataWrap对象 "+dw.a+","+dw.b);
		
		
		
	}
	
	
}
