package com.kaesar.threads.test.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean hasWaiters(Condition condition) 的作用是查询是否有线程正在等待与此锁定有关的condition条件
 * @author chengkai
 *
 */
public class Service {

	private ReentrantLock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void waitMethod() {
		try {
			lock.lock();
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void notifyMethod() {
		try {
			lock.lock();
			System.out.println("有没有线程正在等待condition？" + lock.hasWaiters(condition) + " 线程数是多少？" + lock.getWaitQueueLength(condition));
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}
