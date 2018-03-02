package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThreadA[] threadAs = new MyThreadA[10];
		MyThreadB[] threadBs = new MyThreadB[10];
		for(int i = 0; i < 10; i++) {
			threadAs[i] = new MyThreadA(service);
			threadBs[i] = new MyThreadB(service);
			threadAs[i].start();
			threadBs[i].start();
		}
	}
}
