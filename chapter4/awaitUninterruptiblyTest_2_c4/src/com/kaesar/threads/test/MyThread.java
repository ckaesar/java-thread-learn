package com.kaesar.threads.test;

public class MyThread extends Thread {

	private Service service;
	
	public MyThread(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.testMethod();
	}
}
