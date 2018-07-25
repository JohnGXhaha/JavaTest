package com.model.exceptionTest;

import java.io.IOException;

/**
 * 自定义异常类
 * */

public class exceptionTest extends Exception{
	
	public exceptionTest(){
	}
	
	//自定义异常提示信息
	public exceptionTest(String msg){
		super(msg);
	}
	
	//返回追踪到的原始信息
	public exceptionTest(Throwable t){
		super(t);
	}
	
	public void test(String numStr) throws exceptionTest{
		try {
			int num=Integer.parseInt(numStr);
		} catch (NumberFormatException e) {
//			throw new exceptionTest(e);
			throw new exceptionTest("数字转换异常啦异常啦!");
		}catch (Exception e) {
			throw new exceptionTest(e);
		}
		
	}
	
	public static void main(String[] args) throws exceptionTest {
//		if(true){
//			throw new exceptionTest("异常啦异常啦!");
//		}
		
		try {
			new exceptionTest().test("dd");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
