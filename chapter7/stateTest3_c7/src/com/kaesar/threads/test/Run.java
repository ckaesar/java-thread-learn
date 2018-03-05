package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 thread1 = new MyThread1();
		thread1.setName("a");
		thread1.start();
		MyThread2 thread2 = new MyThread2();
		thread2.setName("B");
		thread2.start();
		Thread.sleep(1000);
		System.out.println("main方法中的t2状态：" + thread2.getState());
	}
}
