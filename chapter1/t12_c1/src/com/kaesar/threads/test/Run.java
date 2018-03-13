package com.kaesar.threads.test;

/**
 * interrupted()方法：测试当前线程是否已经中断，当前线程是指运行this.interrupted()方法的线程
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.sleep(1000);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			System.out.println("是否停止1？ = " + thread.interrupted());
			System.out.println("是否停止2？ = " + thread.interrupted());
		} catch (Exception e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
