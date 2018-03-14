package com.kaesar.threads.test;

/**
 * synchronized代码块间的同步性：当一个线程访问object的一个synchronized(this)代码块时，其他线程对同一个object中所有其他synchronized(this)同步代码块的访问将被阻塞，这说明synchronized使用的“对象监视器”是一个
 * @author chengkai
 *
 */
public class ObjectService {
	
	public void serviceMethodA() {
		try {
			synchronized(this) {
				System.out.println("A begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void serviceMethodB() {
		synchronized(this) {
			System.out.println("B begin time=" + System.currentTimeMillis());
			System.out.println("B end time=" + System.currentTimeMillis());
		}
	}
}
