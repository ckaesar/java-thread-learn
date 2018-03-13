package com.kaesar.threads.test;

/**
 * currentThread()方法：可以返回代码段正在被哪个线程调用的信息
 * @author chengkai
 *
 */
public class MyThread extends Thread {
 
	public MyThread() {
		System.out.println("构造方法的打印：" + Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println("run方法的打印：" + Thread.currentThread().getName());
	}
}
