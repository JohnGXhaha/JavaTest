package com.classTest.AOP;

public class BigDog implements Dog{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("大狗在吃骨头");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("大狗在跑");
	}

}
