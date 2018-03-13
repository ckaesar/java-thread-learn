package com.kaesar.threads.test;

/**
 * sleep()方法：在指定的毫秒数内让当前“正在执行的线程”休眠（暂停执行）。这个“正在执行的线程”是指this.currentThread()返回的线程
 * @author chengkai
 *
 */
public class MyThread1 extends Thread {
	
	@Override
	public void run() {
		try {
			System.out.println("run threadName=" + this.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadName=" + this.currentThread().getName() + " end");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
