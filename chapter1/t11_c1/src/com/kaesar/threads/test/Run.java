package com.kaesar.threads.test;

/**
 * interrupt()方法：停止线程，仅仅是在当前线程中打了一个停止的标记，并不是真的停止线程
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
