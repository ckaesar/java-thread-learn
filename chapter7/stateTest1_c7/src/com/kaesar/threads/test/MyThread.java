package com.kaesar.threads.test;

/**
 * NEW状态是线程实例化后还从未执行start()方法时的状态
 * RUNNABLE状态是线程进入运行的状态
 * TERMINATED是线程被销毁时的状态
 * 
 * @author chengkai
 *
 */
public class MyThread extends Thread {

	public MyThread() {
		System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
	}
	
	@Override
	public void run() {
		System.out.println("run方法中的状态：" + Thread.currentThread().getState());
	}
}
