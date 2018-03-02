package com.kaesar.threads.test;

/**
 * 运行结果可知：控制台打印的hashCode值并不相同，说明创建了多个对象，并不是单例的
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
	}
}
