package com.kaesar.threads.test;

public class Run2 {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		System.out.println("begin=" + System.currentTimeMillis());
		myThread1.start();
		System.out.println("end=" + System.currentTimeMillis());
	}
}
