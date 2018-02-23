package com.kaesar.threads.test;

public class Run1 {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA threadA = new ThreadA(service);
		threadA.setName("A");
		ThreadB threadB = new ThreadB(service);
		threadB.setName("B");
		threadA.start();
		Thread.sleep(50); //存在50毫秒
		threadB.start();
	}
}
