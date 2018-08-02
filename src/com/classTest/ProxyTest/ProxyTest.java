package com.classTest.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
//动态代理
public class ProxyTest {
	public static void main(String[] args) {
		//创建InvocationHandler对象
		InvocationHandler invoketionHandle=new MyinvoketionHandle();
		//用InvocationHandler创建动态代理对象
		Person p=(Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, invoketionHandle);
		
		p.say("你好");
		p.walk();
			
	}
}
