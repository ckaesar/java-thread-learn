package com.kaesar.threads.test;

/**
 * 实例变量共享，但会产生“非线程安全”问题
 * @author chengkai
 *
 */
public class MyThread extends Thread {

	private int count = 5;
	
	@Override
	public void run() {
		super.run();
		count--;
		//此示例不要用for语句，因为使用同步后其他线程就得不到运行的机会，一直由一个线程进行减法运算
		System.out.println("由 " + this.currentThread().getName() + " 计算， count=" + count);
	}
}
