package com.kaesar.threads.test;

/**
 * 运行代码可知：在默认的情况下，线程组中的一个线程出现异常不会影响到其他线程的运行。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("我的线程组");
		MyThread[] myThreads = new MyThread[10];
		for(int i = 0; i < 10; i++) {
			myThreads[i] = new MyThread(group, "线程" + (i+1), "1");
			myThreads[i].start();
		}
		MyThread newT = new MyThread(group, "报错线程", "a");
		newT.start();
	}
}
