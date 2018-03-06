package com.kaesar.threads.test;

/**
 * 线程对象关联线程组：1级关联
 *    所谓的1级关联就是父对象中有子对象，但并不创建子孙对象。这种情况经常出现在开发中，比如创建一些线程时，为了有效地对这些
 * 线程进行组织管理，通常的情况下是创建一个线程组，然后再将部分线程归属到该组中。这样的处理可以对零散的线程对象进行有效的组织
 * 与规划。
 * 
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadGroup group = new ThreadGroup("ck的线程组");
		Thread aThread = new Thread(group, a);
		Thread bThread = new Thread(group, b);
		aThread.start();
		bThread.start();
		System.out.println("活动的线程数为：" + group.activeCount());
		System.out.println("线程组的名称为：" + group.getName());
	}
}
