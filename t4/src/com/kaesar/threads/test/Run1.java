package com.kaesar.threads.test;

public class Run1 {

	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
		Thread a = new Thread(myThread, "A");
		Thread b = new Thread(myThread, "B");
		Thread c = new Thread(myThread, "C");
		Thread d = new Thread(myThread, "D");
		Thread e = new Thread(myThread, "E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
