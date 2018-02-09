package com.kaesar.threads.test;

public class MyThreadA extends Thread {
	
	private Sub sub;
	
	public MyThreadA(Sub sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}
}
