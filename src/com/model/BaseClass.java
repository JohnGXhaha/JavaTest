package com.model;

import java.io.IOException;

public class BaseClass {
	
	
	public BaseClass() {
		System.out.println("父类");
	}

	public void test() throws IOException{
		System.out.println("父类test方法!");
	}
}
