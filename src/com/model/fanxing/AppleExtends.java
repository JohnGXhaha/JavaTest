package com.model.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 *�������������� 
 * */

//�������ּ̳е�д��������
//public class AppleExtends extends Apple {
public class AppleExtends extends Apple<String> {

	public AppleExtends(String t) {
		super(t);
	}
	
	
	@Override
	public String getInfo(){
		return "����getInfo(���Ǹ���getInfo)"; 
//		return super.getInfo();
//		return 0;
	}
	
	//ֻ�ܴ���object����list
	public static void test(List<Object> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	//�ɴ����κ����͵�list
	public static void test2(List<?> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
	
	public static<T> void test3(List<T> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		for(T t:list){
			System.out.println(t);
//			list.add(t);
		}
	}
	
	//���������βε�����(����ͨ����βδ�������Apple������,����Apple����)
	public static void testFanXing(List<? extends Apple> apples){
		for(Apple a:apples){
			a.getInfo();
		}
	}
	
	
	public static void main(String[] args) {
		AppleExtends appleExtends=new AppleExtends("aaa");
		System.out.println(appleExtends.getInfo());
		//ֻ�ܴ���object����list
		List<Object> list=new ArrayList<Object>();
		test(list);
		//�ɴ����κ����͵�list
		List<String> list2=new ArrayList<String>();
		test2(list2);
		test3(list2);
		
		List<?> list3=new ArrayList<String>();
		//���´���ᱨ�������(ͨ������͵Ķ����޷����Ԫ��,��Ϊ�޷�׼ȷ֪�����������ʲô)
//		list3.addAll("1");
		List<AppleExtends> appleExtendsList=new ArrayList<AppleExtends>();
		testFanXing(appleExtendsList);
		
		test3(appleExtendsList);
		
		List<? extends Apple> List4=new ArrayList<AppleExtends>();
		//���´���ᱨ�������(ͨ������͵Ķ����޷����Ԫ��,��Ϊ�޷�׼ȷ֪�����������ʲô)
//		List4.add(new AppleExtends("bbb"));
		
		List<Integer> list5=new ArrayList<Integer>();
		list5.add(1);
		list5.add(2);
 		//���´���������
		//System.out.println((String)list5.get(0));
		
	}
} 
