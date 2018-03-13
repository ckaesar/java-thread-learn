package com.kaesar.threads.test;

/**
 * 线程优先级的继承特性：线程的优先级具有继承性，比如A线程启动B线程，则B线程的优先级与A是一样的
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
		MyThread1 thread1 = new MyThread1();
		thread1.start();
	}
}
