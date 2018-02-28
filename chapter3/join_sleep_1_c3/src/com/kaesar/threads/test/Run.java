package com.kaesar.threads.test;

/**
 * 由于线程ThreadA使用Thread.sleep(long)方法一直持有ThreadB对象的锁，时间达到6秒，所以线程ThreadC只有在ThreadA时间达到6秒释放ThreadB的锁时，才可以调用ThreadB中的同步方法bService()
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			Thread.sleep(1000);
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
