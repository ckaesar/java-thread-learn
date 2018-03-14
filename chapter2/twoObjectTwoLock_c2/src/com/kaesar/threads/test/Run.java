package com.kaesar.threads.test;

/**
 * 多个对象多个锁：两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，效果是以异步的方式运行的。
 * 原因：关键字synchronized取得的锁都是对象锁，而不是把一段代码或方法（函数）当作锁，所以在这个示例中，哪个线程
 * 先执行带synchronized关键字的方法，哪个线程就持有该方法所属对象的锁Lock，那么其他线程只能呈等待状态，前提是
 * 多个线程访问的是同一个对象。如果多个线程访问多个对象，则JVM会创建多个锁。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
		
		ThreadA threadA = new ThreadA(numRef1);
		threadA.start();
		ThreadB threadB = new ThreadB(numRef2);
		threadB.start();
	}
}
