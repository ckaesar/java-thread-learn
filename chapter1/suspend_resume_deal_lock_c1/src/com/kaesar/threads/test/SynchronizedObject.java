package com.kaesar.threads.test;

/**
 * suspend与resume方法的缺点：独占锁
 * @author chengkai
 *
 */
public class SynchronizedObject {
	
	synchronized public void printString() {
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("a线程永远suspend了！");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
