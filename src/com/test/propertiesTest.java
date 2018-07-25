package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro=new Properties();
		pro.setProperty("userName", "user");
		pro.setProperty("passWord", "1234");
	
		pro.store(new FileOutputStream("a.ini"), "TestProperties");
	}
}
