package com.kaesar.threads.test;

/**
 * 运行程序发现：方法wait下面的代码不执行了，但线程不能永远等待下去，那样程序就停止不前了，不继续向下进行。要使呈等待wait状态的线程继续运行，就要使用到notify()方法了
 * @author chengkai
 *
 */
public class Test2 {

	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn上面");
			synchronized (lock) {
				System.out.println("syn第一行");
				lock.wait();
				System.out.println("wait下的代码");
			}
			System.out.println("syn下面的代码");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
