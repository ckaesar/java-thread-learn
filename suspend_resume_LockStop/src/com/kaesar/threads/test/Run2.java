package com.kaesar.threads.test;

public class Run2 {

	public static void main(String[] args) {
		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(1000);
			thread.suspend();
			System.out.println("main end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
