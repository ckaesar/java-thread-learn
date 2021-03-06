package com.kaesar.threads.test;

/**
 * “main end” 无法打印，因为当程序运行到println()方法内部停止时，同步锁未被释放。
 * @author chengkai
 *
 */
public class Run2 {

	public static void main(String[] args) {
		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(1000);
			thread.suspend();
			System.out.println("main end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
