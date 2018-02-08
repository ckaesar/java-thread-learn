package com.kaesar.threads.test;

public class MyThread2 extends Thread {

	private long i = 0;
	
	@Override
	public void run() {
		while(true) {
			i++;
			System.out.println(i);
		}
	}
}
