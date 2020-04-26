package com.Thread.ThreadLocalTest;

public class MyThread extends Thread{
	private Account account;

	public MyThread(Account account,String name) {
		super(name);
		this.account = account;
	}
	
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			if(i==6){
				account.setName(getName());
			}
			System.out.println(account.getName()+"ÕË»§µÄiÖµ"+i);
		}
	}
	
	
}
