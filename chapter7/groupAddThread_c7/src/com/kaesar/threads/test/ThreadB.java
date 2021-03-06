package com.kaesar.threads.test;

public class ThreadB extends Thread {

	@Override
	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Thread is interrupted:" + Thread.currentThread().getName());
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
