package com.kaesar.threads.test;

/**
 * 带一个参数的wait(long)方法的功能是等待某一时间内是否有线程对锁进行唤醒，如果超过这个时间则自动唤醒。
 * @author chengkai
 *
 */
public class MyRunnable {

	static private Object lock = new Object();
	
	static private Runnable runnable1 = new Runnable() {
		
		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("wait begin timer=" + System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait end timer=" + System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	
	public static void main(String[] args) {
		Thread t = new Thread(runnable1);
		t.start();
	}
}
