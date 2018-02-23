package com.kaesar.threads.test;

public class ThreadA extends Thread {

	@Override
	public void run() {
		Service.printA();
	}
}
