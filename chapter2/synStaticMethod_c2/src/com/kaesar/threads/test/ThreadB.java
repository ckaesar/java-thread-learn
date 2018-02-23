package com.kaesar.threads.test;

public class ThreadB extends Thread {
	
	@Override
	public void run() {
		Service.printB();
	}

}
