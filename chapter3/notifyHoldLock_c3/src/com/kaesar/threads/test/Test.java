package com.kaesar.threads.test;

/**
 * 运行结果可知：必须执行完notify()方法所在的同步synchronized代码块后才释放锁，也就是notify()执行后不释放锁
 * @author chengkai
 *
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		ThreadA threadA = new ThreadA(lock);
		threadA.start();
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
		SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
		synNotifyMethodThread.start();
	}
}
