package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		Object lock = new Object();
		MyThread threadA = new MyThread(lock, "A", 1);
		MyThread threadB = new MyThread(lock, "B", 2);
		MyThread threadC = new MyThread(lock, "C", 0);
		threadA.start();
		threadB.start();
		threadC.start();
	}
}
