package com.kaesar.threads.test;

/**
 * 运行结果是：打印一行“methodA begin”后，线程B永远得不到运行的机会，锁死了。
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
