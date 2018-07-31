package com.classTest.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//动态代理的方法实现
public class MyinvoketionHandle implements InvocationHandler{
	private Object target;
	
//	public Object getTarget() {
//		return target;
//	}

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("执行的方法为"+method);
		/**AOP面向切面编程(可在不改变原方法的情况下在方法前面和后面加入代码),
			非常灵活的实现了解耦合*/
		System.out.println("方法前加入");
		Object result=method.invoke(target, args);
		System.out.println("方法后加入");
		
		return result;
	}

}
