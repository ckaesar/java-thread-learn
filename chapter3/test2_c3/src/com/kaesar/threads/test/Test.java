package com.kaesar.threads.test;

/**
 * 运行程序可知：wait线程在3秒后被notify通知唤醒
 * @author chengkai
 *
 */
public class Test {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			MyThread1 thread1 = new MyThread1(lock);
			thread1.start();
			Thread.sleep(3000);
			
			MyThread2 thread2 = new MyThread2(lock);
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
