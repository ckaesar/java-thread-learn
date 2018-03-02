package com.kaesar.threads.test.test3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean isLocked() 的作用是查询此锁定是否由任意线程保持
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
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isLocked());
		} finally {
			lock.unlock();
		}
	}
}
