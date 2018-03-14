package com.kaesar.threads.test;

/**
 * 运行结果可知：当存在父子类继承关系时，子类是完全可以通过“可重入锁”调用父类的同步方法的。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
