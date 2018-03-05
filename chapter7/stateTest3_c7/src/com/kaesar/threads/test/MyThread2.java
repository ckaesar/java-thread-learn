package com.kaesar.threads.test;

public class MyThread2 extends Thread{

	@Override
	public void run() {
		MyService.serviceMethod();
	}
}
