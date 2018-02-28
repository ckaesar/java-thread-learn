package com.kaesar.threads.test;

/**
 * 使用类InheritableThreadLocal可以在子线程中取得父线程继承下来的值
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("在Main线程中取值=" + Tools.t1.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
