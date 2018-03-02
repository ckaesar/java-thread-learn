package com.kaesar.threads.test.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean isHeldByCurrentThread() 的作用是查询当前线程是否保持此锁定
 * @author chengkai
 *
 */
public class Service {

	private ReentrantLock lock;
	
	public Service(boolean isFair) {
		super();
		this.lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod() {
		try {
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
		} finally {
			lock.unlock();
		}
	}
}
