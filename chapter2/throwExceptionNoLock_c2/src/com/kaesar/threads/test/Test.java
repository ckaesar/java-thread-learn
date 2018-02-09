package com.kaesar.threads.test;

public class Test {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			
			ThreadA threadA = new ThreadA(service);
			threadA.setName("a");
			threadA.start();
			Thread.sleep(500);
			ThreadB threadB = new ThreadB(service);
			threadB.setName("b");
			threadB.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
