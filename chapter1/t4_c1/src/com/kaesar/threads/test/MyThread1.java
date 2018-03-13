package com.kaesar.threads.test;

/**
 * 实例变量共享，使用synchronized关键字。synchronized可以在任意对象及方法上加锁，而加锁的这段代码成为“互斥区”或“临界区”
 * @author chengkai
 *
 */
public class MyThread1 extends Thread {
	
	private int count = 5;
	
	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("由 " + this.currentThread().getName() + " 计算， count=" + count);
	}
}
