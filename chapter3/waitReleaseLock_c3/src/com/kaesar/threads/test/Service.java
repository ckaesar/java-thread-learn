package com.kaesar.threads.test;

public class Service {

	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				lock.wait(); //wait()方法释放锁
//				Thread.sleep(3000); //sleep()方法不释放锁
				System.out.println("end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
