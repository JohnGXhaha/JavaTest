package com.model;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.E);
		double randomCount=Math.random();
		double randomCount1=Math.random();
		System.out.println(randomCount);
		System.out.println(randomCount1);
		System.out.println((int)(randomCount*10));
		System.out.println("#####################");
		//未设定种子
		Random r=new Random();
		System.out.println(r.nextDouble());
		//设定种子
		Random r1=new Random(20);
		Random r2=new Random(20);
		Random r3=new Random(System.currentTimeMillis());
		System.out.println(r3.nextDouble());
		
		System.out.println("循环开始-----------");
		
		for(int i=0;i<5;i++){
			System.out.println(r1.nextDouble());
			System.out.println(r1.nextDouble());
			System.out.println(r2.nextDouble());
			System.out.println("-----------");
		}
	}
}
