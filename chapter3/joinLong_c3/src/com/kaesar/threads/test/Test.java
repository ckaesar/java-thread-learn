package com.kaesar.threads.test;

/**
 * 方法join(long)的功能是使用wait(long)方法来实现的，所以join(long)方法具有释放锁的特点。
 * 而Thread.sleep(long)方法却不释放锁。
 * @author chengkai
 *
 */
public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join(2000); //只等2秒
//			Thread.sleep(2000); //效果类似，处理不同
			System.out.println("end time=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
