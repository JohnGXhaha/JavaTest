package com.classTest.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//��̬����ķ���ʵ��
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
		System.out.println("ִ�еķ���Ϊ"+method);
		/**AOP����������(���ڲ��ı�ԭ������������ڷ���ǰ��ͺ���������),
			�ǳ�����ʵ���˽����*/
		System.out.println("����ǰ����");
		Object result=method.invoke(target, args);
		System.out.println("���������");
		
		return result;
	}

}
