package com.classTest;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
//��ȡ����
public class GenericTest {
	private Map<String,Integer> score;
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<GenericTest> clazz=GenericTest.class;
		Field f=clazz.getDeclaredField("score");
		//��ȡ��Ա����f������
		Class<?> a=f.getType();
		System.out.println("score����:"+a);
		//��ȡ��������
		Type gtype=f.getGenericType();
		System.out.println(gtype);
		
		ParameterizedType pt=(ParameterizedType)gtype;
		System.out.println("ԭʼ����:"+pt.getRawType());
		
		Type[] tArgs=pt.getActualTypeArguments();
		for(int i=0;i<tArgs.length;i++) {
			System.out.println("��"+i+"������:"+tArgs[i]);
		}
		
	}
	
}
