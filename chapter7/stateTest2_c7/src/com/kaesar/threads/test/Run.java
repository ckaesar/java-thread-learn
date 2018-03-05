package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			System.out.println("main方法中的状态：" + thread.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
