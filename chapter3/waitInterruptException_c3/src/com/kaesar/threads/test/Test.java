package com.kaesar.threads.test;

public class Test {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA threadA = new ThreadA(lock);
			threadA.start();
			Thread.sleep(5000);
			threadA.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
