package com.kaesar.threads.test;

/**
 * 类 ReentrantReadWriteLock 的使用：写写互斥
 * 运行结果可知：使用写锁代码lock.writeLock()的效果就是同一时间只允许一个线程执行lock()方法后面的代码
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		a.start();
		b.start();
	}
}
