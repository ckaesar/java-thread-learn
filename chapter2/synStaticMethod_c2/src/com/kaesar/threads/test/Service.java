package com.kaesar.threads.test;

/**
 * 关键字synchronized还可以应用在static静态方法上，如果这样写，那是对当前的*.java文件对应的Class类进行持锁。
 * @author chengkai
 *
 */
public class Service {

	synchronized public static void printA() {
		try {
			System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
			Thread.sleep(3000);
			System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public static void printB() {
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB");
	}
}
