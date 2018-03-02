package com.kaesar.threads.test.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法 int getQueueLength() 的作用是返回正等待获取此锁定的线程估计数，比如有5个线程，1个线程首先执行await()方法，那么在调用getQueueLength()方法后返回值是4，说明有4个线程同时在等待lock的释放
 * @author chengkai
 *
 */
public class Service {

	public ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1() {
		try {
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "进入方法！");
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
