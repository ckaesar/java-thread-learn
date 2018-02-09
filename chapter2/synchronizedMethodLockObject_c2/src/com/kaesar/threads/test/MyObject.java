package com.kaesar.threads.test;

public class MyObject {

	synchronized public void methodA() { //添加synchronized关键字，测试锁对象
//	public void methodA() {
		try {
			System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
