package com.kaesar.threads.test;

public class MyThreadB extends Thread {

	private Service service;
	
	public MyThreadB(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.notifyMethod();
	}
}
