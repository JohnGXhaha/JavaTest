package com.classTest.AOP;

public class BigDog implements Dog{

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println("���ڳ�"+food);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

}
