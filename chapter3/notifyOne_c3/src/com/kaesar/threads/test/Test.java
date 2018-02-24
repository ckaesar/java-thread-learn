package com.kaesar.threads.test;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		ThreadA threadA = new ThreadA(lock);
		threadA.start();
		ThreadB threadB = new ThreadB(lock);
		threadB.start();
		ThreadC threadC = new ThreadC(lock);
		threadC.start();
		Thread.sleep(1000);
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
	}
}
