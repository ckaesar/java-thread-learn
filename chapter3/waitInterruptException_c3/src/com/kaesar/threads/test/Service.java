package com.kaesar.threads.test;

/**
 * 验证：当线程呈wait()状态时，调用线程对象的interrupt()方法会出现InterruptedException异常。
 * @author chengkai
 *
 */
public class Service {

	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				lock.wait();
				System.out.println("end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
		}
	}
}
