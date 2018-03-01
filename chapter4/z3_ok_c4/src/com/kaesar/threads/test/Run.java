package com.kaesar.threads.test;

/**
 * 运行程序可知：在控制台只打印了一个字母A,原因是调用了Condition对象的await()方法，使当前执行任务的线程进入了等待WAITING状态
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.start();
	}
}
