package com.kaesar.threads.test;

/**
 * 守护线程(Daemon)：当进程中不存在非守护线程了，则守护线程自动销毁。  
 * 守护线程的作用是为其他线程的运行提供便利服务，守护线程最典型的的应用就是GC（垃圾回收器），它就是一个很称职的守护者
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(5000);
			System.out.println("我离开thread对象也不再打印了，也就是停止了！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
