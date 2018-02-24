package com.kaesar.threads.test;

public class NotifyThread extends Thread {

	private Object lock;
	
	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			lock.notify();
//			lock.notify(); //多次调用notify()方法唤醒全部WAITING中的线程
//			lock.notify();
		}
	}
}
