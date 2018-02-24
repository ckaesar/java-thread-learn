package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			MyThread[] myThreads = new MyThread[5];
			for(int i = 0; i < myThreads.length; i++) {
				myThreads[i] = new MyThread(service);
			}
			for(int i = 0; i < myThreads.length; i++) {
				myThreads[i].start();
			}
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
