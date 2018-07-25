package com.Thread.ThreadLocalTest;

public class test {
	public static void main(String[] args) {
		Account at=new Account("初始名");
		new MyThread(at,"线程甲").start();
		new MyThread(at,"线程乙").start();
	}
}
