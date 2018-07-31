package com.classTest.AOP;

import java.lang.reflect.Proxy;

//动态代理创建
public class MyProxyFactory {
	
	public static Object getProxy(Object target) {
		
		MyinvoketionHandle myinvoketionHandle=new MyinvoketionHandle();
		myinvoketionHandle.setTarget(target);
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), myinvoketionHandle);
	}
	
}
