package com.kaesar.threads.test;

public class MyThread1 extends Thread {
	
	private int count = 5;
	
	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("由 " + this.currentThread().getName() + " 计算， count=" + count);
	}
}
