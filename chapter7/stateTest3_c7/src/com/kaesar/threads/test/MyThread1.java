package com.kaesar.threads.test;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		MyService.serviceMethod();
	}
}
