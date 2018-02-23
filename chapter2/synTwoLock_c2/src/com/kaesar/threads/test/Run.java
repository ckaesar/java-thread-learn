package com.kaesar.threads.test;

/**
 * 异步的原因是持有不同的锁，一个是对象锁，另外一个是Class锁，而Class锁可以对类的所有对象实例起作用。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		
		ThreadA threadA = new ThreadA(service);
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service);
		threadB.setName("B");
		threadB.start();
		
		ThreadC threadC = new ThreadC(service);
		threadC.setName("C");
		threadC.start();
	}
}
