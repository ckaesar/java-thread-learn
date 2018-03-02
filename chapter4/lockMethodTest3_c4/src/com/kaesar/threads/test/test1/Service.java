package com.kaesar.threads.test.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean isFair() 的作用是判断是不是公平锁
 * 在默认情况下，ReentrantLock 类使用的是非公平锁
 * @author chengkai
 *
 */
public class Service {

	private ReentrantLock lock;
	
	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("公平锁情况：" + lock.isFair());
		} finally {
			lock.unlock();
		}
	}
}
