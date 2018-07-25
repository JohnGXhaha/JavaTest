package com.model.fanxing;

/**定义类型形参时设定上限(T类型形参可以指定任意类型,可以为类和方法使用,其指定之后只能使用一开始指定好的类型.
						?通配符类型可以指定任意类型,只能为方法使用,其指定类型之后,由于?仍代表类型不确定,有些函数会遭到限制,如list.add)
						
						使用<T>来声明类型持有者名称，自定义泛型类时，类持有者名称可以使用T(Type)，
						如果是容器的元素可以使用E(Element)，
						若键值匹配可以用K(Key)和V(Value)等，
						若是<?>，则是默认是允许Object及其下的子类，也就是java的所有对象了
						
						T是类型 ?是泛指
						T为待指定即将确定的类型,?为完全不确定的类型
						
						如果一个方法中形参的类型(a)或者返回值类型依赖于另一个形参(b)类型,那么形参类型(b)不要用通配符,反之则要用通配符.
						大多数时候都可以使用泛型方法来代替类型通配符(因为泛型方法没有任何函数限制)
						
*/
//public class Apple<T extends Object> {
public class Apple<T> {
	private T info;
	public Apple(T t){
		this.info=t;
		System.out.println(t);
	}
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
	
}
