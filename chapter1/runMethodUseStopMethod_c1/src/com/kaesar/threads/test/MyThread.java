package com.kaesar.threads.test;

/**
 * 调用stop()方法时会抛出java.lang.ThreadDeath异常
 * @author chengkai
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入了catch()方法！");
			e.printStackTrace();
		}
	}
}
