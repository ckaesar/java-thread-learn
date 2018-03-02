package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyThread thread = new MyThread(service);
			thread.start();
			Thread.sleep(3000);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
