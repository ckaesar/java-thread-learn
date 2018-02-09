package com.kaesar.threads.test;

/**
 * 当两个并发线程访问同一个对象object中的synchronized(this)同步代码块时，一段时间内只能有一个线程被执行，另一个线程必须等待当前线程执行完整个代码块以后才能执行该代码块
 * @author chengkai
 *
 */
public class ObjectService {

	public void serviceMethod() {
		try {
			synchronized(this) {
				System.out.println("beginTime=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("endTime=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
