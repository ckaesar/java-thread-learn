package com.kaesar.threads.test;

/**
 * 类 ReentrantReadWriteLock 的使用：写读互斥
 * 运行结果可知：“写读”操作是互斥的
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		Thread.sleep(1000);
		
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
	}
}
