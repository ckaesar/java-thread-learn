package com.kaesar.threads.test;

/**
 * 运行结果不会出现同步等待的情况
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA threadA = new ThreadA(service);
		threadA.start();
		ThreadB threadB = new ThreadB(service);
		threadB.start();
	}
}
