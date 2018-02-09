package com.kaesar.threads.test;

public class Sub extends Main {

	@Override
//	synchronized public void serviceMethod() { //在子类的方法中添加synchronized关键字，测试
	public void serviceMethod() {
		try {
			System.out.println("int sub 下一步 sleep begin threadName=" + Thread.currentThread().getName() + " time=" +System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub 下一步 sleep end threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
			super.serviceMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
