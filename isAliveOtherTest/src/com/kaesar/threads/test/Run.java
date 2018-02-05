package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		CountOperate countOperate = new CountOperate();
		Thread t1 = new Thread(countOperate);
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}
}
