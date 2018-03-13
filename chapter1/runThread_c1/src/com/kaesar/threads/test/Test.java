package com.kaesar.threads.test;

/**
 * getId()方法：取得线程的唯一标识
 * @author chengkai
 *
 */
public class Test {

	public static void main(String[] args) {
		Thread runThread = Thread.currentThread();
		System.out.println(runThread.getName() + " " + runThread.getId());
	}
}
