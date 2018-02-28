package com.kaesar.threads.test;

/**
 * 运行结果说明：join(long)方法具有释放锁的特点
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
