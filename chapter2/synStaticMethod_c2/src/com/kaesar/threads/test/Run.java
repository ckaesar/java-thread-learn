package com.kaesar.threads.test;

/**
 * 从运行结果看，和将synchronized关键字加到非static方法上使用的效果是一样的。其实本质上是不同的，synchronized关键字加到static静态方法上是给Class类上锁，而synchronized关键字加到非static静态方法上是给对象上锁。为了验证不是同一个锁，看项目synTwoLock_c2
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		threadB.setName("B");
		threadB.start();
	}
}
