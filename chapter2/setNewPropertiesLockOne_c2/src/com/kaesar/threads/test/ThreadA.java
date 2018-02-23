package com.kaesar.threads.test;

public class ThreadA extends Thread {

	private Service service;
	private UserInfo userInfo;
	
	public ThreadA(Service service, UserInfo userInfo) {
		super();
		this.service = service;
		this.userInfo = userInfo;
	}
	
	@Override
	public void run() {
		service.serviceMethodA(userInfo);
	}
}
