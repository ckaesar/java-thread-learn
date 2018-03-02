package com.kaesar.threads.test;

public class Run1 {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThreadA threadA = new MyThreadA(service);
		threadA.start();
	}
}
