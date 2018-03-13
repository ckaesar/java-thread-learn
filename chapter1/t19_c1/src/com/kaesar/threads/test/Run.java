package com.kaesar.threads.test;

/**
 * 线程的优先级具有一定的规则性：也就是CPU尽量将执行资源让给优先级比较高的线程
 * 高优先级的线程总是大部分先执行完，但不代表高优先级的线程全部先执行完。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			MyThread1 thread1 = new MyThread1();
			thread1.setPriority(10);
			thread1.start();
			MyThread2 thread2 = new MyThread2();
			thread2.setPriority(1);
			thread2.start();
		}
	}
}
