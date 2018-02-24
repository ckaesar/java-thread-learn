package com.kaesar.threads.test;

public class Test {

	public static void main(String[] args) {
		MyList service = new MyList();
		ThreadA threadA = new ThreadA(service);
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB(service);
		threadB.setName("B");
		threadB.start();
	}
}
