package com.classTest.ProxyTest;

import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		MyinvoketionHandle invoketionHandle=new MyinvoketionHandle();
		
		Person p=(Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, invoketionHandle);
		
		p.say("ÄãºÃ");
		p.walk();
		
	}
}
