package com.kaesar.threads.test;

/**
 * 优先级具有随机性：也就是优先级较高的线程不一定每次都先执行完
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			MyThread1 thread1 = new MyThread1();
			thread1.setPriority(5);
			thread1.start();
			MyThread2 thread2 = new MyThread2();
			thread2.setPriority(6);
			thread2.start();
		}
	}
}
