package com.kaesar.threads.test;

public class Service {

	public void serviceMethodA(UserInfo userInfo) {
		synchronized (userInfo) {
			try {
				System.out.println(Thread.currentThread().getName());
				userInfo.setUsername("abcabcabc");
				Thread.sleep(3000);
				System.out.println("end! time=" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
