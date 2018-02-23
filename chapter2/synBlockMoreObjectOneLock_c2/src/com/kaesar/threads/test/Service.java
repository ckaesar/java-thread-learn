package com.kaesar.threads.test;

/**
 * 验证：同步synchronized(class)代码块的作用其实和synchronized static方法的作用是一样的。
 * @author chengkai
 *
 */
public class Service {

	public static void printA() {
		synchronized(Service.class) {
			try {
				System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
				Thread.sleep(3000);
				System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void printB() {
		synchronized(Service.class) {
			System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
			System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB");
		}
	}
}
