package com.model.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 *泛型派生的子类 
 * */

//以下两种继承的写法都可以
//public class AppleExtends extends Apple {
public class AppleExtends extends Apple<String> {

	public AppleExtends(String t) {
		super(t);
	}
	
	
	public String getInfo(){
		return "子类getInfo(覆盖父类getInfo)"; 
//		return super.getInfo();
//		return 0;
	}
	
	//只能传入object类型list
	public static void test(List<Object> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	//可传入任何类型的list
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
	
	//设置类型形参的上限(如下通配符形参代表所有Apple的子类,包括Apple本身)
	public static void testFanXing(List<? extends Apple> apples){
		for(Apple a:apples){
			a.getInfo();
		}
	}
	
	
	public static void main(String[] args) {
		AppleExtends appleExtends=new AppleExtends("aaa");
		System.out.println(appleExtends.getInfo());
		//只能传入object类型list
		List<Object> list=new ArrayList<Object>();
		test(list);
		//可传入任何类型的list
		List<String> list2=new ArrayList<String>();
		test2(list2);
		test3(list2);
		
		List<?> list3=new ArrayList<String>();
		//以下代码会报编译错误(通配符泛型的对象无法添加元素,因为无法准确知道这个类型是什么)
//		list3.addAll("1");
		List<AppleExtends> appleExtendsList=new ArrayList<AppleExtends>();
		testFanXing(appleExtendsList);
		
		test3(appleExtendsList);
		
		List<? extends Apple> List4=new ArrayList<AppleExtends>();
		//以下代码会报编译错误(通配符泛型的对象无法添加元素,因为无法准确知道这个类型是什么)
//		List4.add(new AppleExtends("bbb"));
		
		List<Integer> list5=new ArrayList<Integer>();
		list5.add(1);
		list5.add(2);
 		//以下代码编译错误
		//System.out.println((String)list5.get(0));
		
	}
} 
