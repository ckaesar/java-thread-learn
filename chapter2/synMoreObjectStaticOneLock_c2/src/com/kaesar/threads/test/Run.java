package com.kaesar.threads.test;

/**
 * 验证Class锁可以对类的所有对象实例起作用
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		Service service1 = new Service();
		Service service2 = new Service();
		
		ThreadA threadA = new ThreadA(service1);
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service2);
		threadB.setName("B");
		threadB.start();
	}
}
