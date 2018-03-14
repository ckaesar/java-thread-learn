package com.kaesar.threads.test;

/**
 * 不在synchronized块中就是异步执行，在synchronized块中就是同步执行
 * @author chengkai
 *
 */
public class Task {

	public void doLongTimeTask() {
		for(int i = 0; i < 10000; i++) {
			System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
		}
		System.out.println("");
		
		synchronized(this) {
			for(int i = 0; i < 10000; i++) {
				System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
			}
		}
	}
}
