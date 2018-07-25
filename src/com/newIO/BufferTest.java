package com.newIO;

import java.nio.CharBuffer;

public class BufferTest {
	public static void main(String[] args) {
		CharBuffer cb=CharBuffer.allocate(8);
		System.out.println("capacity:"+cb.capacity());
		System.out.println("limit:"+cb.limit());
		System.out.println("position:"+cb.position());
		
		cb.put('a');
		cb.put('b');
		cb.put('c');
		
		System.out.println("添加三个元素后的position:"+cb.position());
		System.out.println("添加三个元素后的limit:"+cb.limit());
		System.out.println(cb.get());
		
		cb.flip();//position置位0,limit置为 原position所在位置,为输出数据做准备
		System.out.println("flip后的position:"+cb.position());
		System.out.println("flip后的limit:"+cb.limit());
		System.out.println("flip后取出第一个元素:"+cb.get());
		System.out.println("flip后取出第一个元素position位置:"+cb.position());
		
		cb.clear();//position置位0,limit置为capacity
		System.out.println("clear后的position:"+cb.position());
		System.out.println("clear后的limit:"+cb.limit());
		//绝对取值
		System.out.println("clear后取出第二个元素:"+cb.get(1));
		//绝对取值不影响position位置
		System.out.println("clear后绝对取出第二个元素position位置:"+cb.position());
	}
}
