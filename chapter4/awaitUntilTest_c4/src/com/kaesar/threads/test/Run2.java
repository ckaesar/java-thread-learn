package com.kaesar.threads.test;

/**
 * 运行结果可知：线程在等待时间到达前，可以被其他线程提前唤醒
 * @author chengkai
 *
 */
public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThreadA threadA = new MyThreadA(service);
		threadA.start();
		Thread.sleep(2000);
		MyThreadB threadB = new MyThreadB(service);
		threadB.start();
	}
}
