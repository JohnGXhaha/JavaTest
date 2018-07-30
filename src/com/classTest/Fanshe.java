package com.classTest;
/**
 * ��ȡClass��������ַ�ʽ
 * 1 Object ����> getClass();
 * 2 �κ��������ͣ����������������ͣ�����һ������̬����class����
 * 3 ͨ��Class��ľ�̬������forName��String  className��(����)
 *
 */
public class Fanshe {
	public static void main(String[] args) {
		//��һ�ַ�ʽ��ȡClass����  
		Fanshe stu1 = new Fanshe();//��һnew ����һ��Student����һ��Class����
		Class stuClass = stu1.getClass();//��ȡClass����
		System.out.println(stuClass.getName());
		
		//�ڶ��ַ�ʽ��ȡClass����
		Class stuClass2 = Fanshe.class;
		System.out.println(stuClass == stuClass2);//�жϵ�һ�ַ�ʽ��ȡ��Class����͵ڶ��ַ�ʽ��ȡ���Ƿ���ͬһ��
		
		//�����ַ�ʽ��ȡClass����
		try {
			Class stuClass3 = Class.forName("com.classTest.Fanshe");//ע����ַ�����������ʵ·�������Ǵ���������·��������.����
			System.out.println(stuClass3 == stuClass2);//�ж����ַ�ʽ�Ƿ��ȡ����ͬһ��Class����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
