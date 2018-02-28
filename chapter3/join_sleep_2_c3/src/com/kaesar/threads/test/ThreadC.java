package com.kaesar.threads.test;

public class ThreadC extends Thread {

	private ThreadB b;
	
	public ThreadC(ThreadB b) {
		super();
		this.b = b;
	}
	
	@Override
	public void run() {
		b.bService();
	}
}
