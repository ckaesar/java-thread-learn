package com.kaesar.threads.test;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			synchronized (Lock.lock) {
				Lock.lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
