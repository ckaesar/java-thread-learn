package com.kaesar.threads.test;

/**
 * 运行程序可知：控制台打印的hashCode是同一个值，说明对象是同一个，也就实现了立即加载型单例设计模式
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
