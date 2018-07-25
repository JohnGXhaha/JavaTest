package com.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

public class test {
	final static int fanalInt=2;
	
	int foo=0;
	public test() {
		foo=9;
		System.out.println("构造器初始化块");
	}
	
	{
		foo=7;
		System.out.println("普通初始化块1");
	}
	
	 static{
		System.out.println("静态初始化块2");
	}
	

	
	public void test1() {
		int foo;
		this.foo=7;
	}

	static public void main(String[] args) {
		System.out.println("Hello World!!!!!");
		System.out.println(new Date());
		//8进制
		System.out.println(013);
		//16进制
		System.out.println(0x13);
		
		char c='中';
		int zhongvalue=c;
		System.out.println(zhongvalue);
		
		String[] a=new String[5 ];
		a[0]="1";
		
		int[][] b=new int[2][];
		b[0]=new int[2];
		b[0][0]=1;
		String bStr; 
		for(int i=0;i<b[0].length;i++){
			bStr=b[0][i]+",";
			System.out.println(bStr);
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		test testA=new test();
		testA.test1();
		System.out.println(testA.foo);
		
		Integer inta=new Integer(128);
		Integer intb=new Integer(128);
	
		System.out.println(inta==intb);
		
		System.out.println(new test().foo);
		//因为fanalInt是final修饰的 所以fanalInt不能再次被赋值
//		fanalInt=3;
		
//		System.gc();
//		Runtime.getRuntime().gc();
		
		ArrayList list=new ArrayList();
//		System.out.println(list.size());
		list.trimToSize();
		list.add("啊啊啊11");
		list.add("啊啊啊22");
		
		ListIterator lit=list.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
			lit.add("循环插入");
		}
		System.out.println("-------------分割---------");
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
//			lit.add("循环插入");
		}
	}
	
	public class innerTest {
		public void info(){
			System.out.println("这是一个内部类");
		}
	}
	
	public void finalize(){
		System.out.println("垃圾回收啊!");
	}
	
}


class test1{
	public static void main(String[] args) {
		test test=new test();
		test.innerTest innerTest=test.new innerTest();
		innerTest.info();
	}
}

