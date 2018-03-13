package com.kaesar.threads.test;

/**
 * isAlve()方法：判断当前的线程是否处于活动状态
 * @author chengkai
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}
