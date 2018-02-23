package com.kaesar.threads.test;

/**
 * 运行结果会交替的打印线程A和线程B的名称，因为持有的锁不是一个
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		
		ThreadA threadA = new ThreadA(service);
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service);
		threadB.setName("B");
		threadB.start();
	}
}
