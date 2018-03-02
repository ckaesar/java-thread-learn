package com.kaesar.threads.test.test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 boolean hasQueueThread(Thread thread) 的作用是查询指定的线程是否正在等待获取此锁定
 * @author chengkai
 *
 */
public class Service {

	public ReentrantLock lock = new ReentrantLock();
	
	public Condition condition = lock.newCondition();
	
	public void waitMethod() {
		try {
			lock.lock();
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
