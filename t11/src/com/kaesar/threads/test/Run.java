package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
