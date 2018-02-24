package com.kaesar.threads.test;

public class Test {

	public static void main(String[] args) {
		Object lock = new Object();
		ThreadA threadA = new ThreadA(lock);
		threadA.start();
		ThreadB threadB = new ThreadB(lock);
		threadB.start();
	}
}
