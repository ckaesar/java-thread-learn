package com.kaesar.threads.test;

/**
 * A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronized类型的方法；
 * A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法则需等待，也就是同步。
 * @author chengkai
 *
 */
public class MyObject {

	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end endTime=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void methodB() { //当该方法有synchronized关键字时，需等待
//	public void methodB() {
		try {
			System.out.println("begin methodB threadName=" + Thread.currentThread().getName() + " beginTime=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
