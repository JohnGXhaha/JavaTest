package com.classTest.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyinvoketionHandle implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("执行的方法为"+method.getName());
		
		if(args!=null) {
			for(Object val:args) {
				System.out.println(args[0]);
			}
		}else {
			System.out.println("该方法没有实参");
		}
		return null;
	}

}
