package com.classTest.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyinvoketionHandle implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ִ�еķ���Ϊ"+method.getName());
		
		if(args!=null) {
			for(Object val:args) {
				System.out.println(args[0]);
			}
		}else {
			System.out.println("�÷���û��ʵ��");
		}
		return null;
	}

}
