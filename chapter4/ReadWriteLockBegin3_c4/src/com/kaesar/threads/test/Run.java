package com.kaesar.threads.test;

/**
 * 类 ReentrantReadWriteLock 的使用：读写互斥
 * 运行结果可知：“读写”操作是互斥的
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		Thread.sleep(1000);
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
