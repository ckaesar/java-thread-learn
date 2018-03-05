package com.kaesar.threads.test;

/**
 * TIMED_WAITING代表线程执行了Thread.sleep()方法，呈等待状态，等待时间到达，继续向下运行
 * @author chengkai
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("begin sleep");
			Thread.sleep(10000);
			System.out.println("end sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
