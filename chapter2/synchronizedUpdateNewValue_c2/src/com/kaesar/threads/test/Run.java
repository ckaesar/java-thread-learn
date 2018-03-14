package com.kaesar.threads.test;

/**
 * 关键字synchronized可以保证在同一时刻,只有一个线程执行某一个方法或某一个代码块。它包含两个特性：互斥性和可见性。
 * 同步synchronized不仅可以解决一个线程看到对象处于不一致的状态，还可以保证进入同步方法或者同步代码块的每个线程，都
 * 看到由同一个锁保护之前所有的修改状态。
 * 
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA threadA = new ThreadA(service);
			threadA.start();
			Thread.sleep(1000);
			ThreadB threadB = new ThreadB(service);
			threadB.start();
			System.out.println("已经发起停止的命令了！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
