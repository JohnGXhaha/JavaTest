package com.classTest.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
//��̬����
public class ProxyTest {
	public static void main(String[] args) {
		//����InvocationHandler����
		InvocationHandler invoketionHandle=new MyinvoketionHandle();
		//��InvocationHandler������̬�������
		Person p=(Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, invoketionHandle);
		
		p.say("���");
		p.walk();
			
	}
}
