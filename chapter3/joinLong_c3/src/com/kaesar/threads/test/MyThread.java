package com.kaesar.threads.test;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("begin Time=" + System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
