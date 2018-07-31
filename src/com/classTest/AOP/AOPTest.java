package com.classTest.AOP;

public class AOPTest {
	public static void main(String[] args) {
		Dog target=new BigDog();
		
		Dog dog=(Dog)MyProxyFactory.getProxy(target);
		
		dog.eat("¹ÇÍ·");
		dog.run();
	}
}
