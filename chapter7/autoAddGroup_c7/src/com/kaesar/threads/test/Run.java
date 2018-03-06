package com.kaesar.threads.test;

/**
 * 线程组自动归属特性：在实例化一个ThreadGroup线程组x时如果不指定所属的线程组，
 * 则x线程组自动归到当前线程对象所属的线程组中，也就是隐式的在一个线程组中添加了一个
 * 子线程组
 * 
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		//方法activeGroupCount()取得当前线程组对象中的子线程组数量
		//方法enumerate()的作用是将线程组中的子线程组以复制的形式拷贝到ThreadGroup[]数组对象中
		System.out.println("A处线程：" + Thread.currentThread().getName() 
							+ " 所属的线程组名为：" 
							+ Thread.currentThread().getThreadGroup().getName() + " " 
							+ " 中有线程组数量；" 
							+ Thread.currentThread().getThreadGroup().activeCount());
		ThreadGroup group = new ThreadGroup("新的组"); //自动加到main组
		System.out.println("B处线程：" + Thread.currentThread().getName() 
				+ " 所属的线程组名为：" 
				+ Thread.currentThread().getThreadGroup().getName() + " " 
				+ " 中有线程组数量；" 
				+ Thread.currentThread().getThreadGroup().activeCount());
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for(int i = 0; i < threadGroup.length; i++) {
			System.out.println("第一个线程组名称为：" + threadGroup[i].getName());
		}
	}
}
