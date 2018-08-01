package com.classTest;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
//获取泛型
public class GenericTest {
	private Map<String,Integer> score;
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<GenericTest> clazz=GenericTest.class;
		Field f=clazz.getDeclaredField("score");
		//获取成员变量f的类型
		Class<?> a=f.getType();
		System.out.println("score类型:"+a);
		//获取泛型类型
		Type gtype=f.getGenericType();
		System.out.println(gtype);
		
		ParameterizedType pt=(ParameterizedType)gtype;
		System.out.println("原始类型:"+pt.getRawType());
		
		Type[] tArgs=pt.getActualTypeArguments();
		for(int i=0;i<tArgs.length;i++) {
			System.out.println("第"+i+"个泛型:"+tArgs[i]);
		}
		
	}
	
}
