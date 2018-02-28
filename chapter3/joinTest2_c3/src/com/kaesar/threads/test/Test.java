package com.kaesar.threads.test;

/**
 * 方法join的作用是使所属的线程对象x正常过执行run()方法中的任务，而使当前线程z进行无限期的阻塞，
 * 等待线程x销毁后再继续执行线程z后面的代码。
 * 方法join具有使线程排队运行的作用，有些类似同步的运行效果。join与synchrod的区别是：join在
 * 内部使用wait()方法进行等待，而synchronized关键字使用的是“对象监视器”原理做为同步。
 * @author chengkai
 *
 */
public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();
			System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
