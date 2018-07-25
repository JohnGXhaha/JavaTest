package com.Thread.ThreadLocalTest;

/**
 * @author JohnGX
 *
 */
public class Account {
	private ThreadLocal<String> name=new ThreadLocal<String>();
	
	public Account(String name) {
		setName(name);
	}

	public String getName() {
		return this.name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}
	
	
}
