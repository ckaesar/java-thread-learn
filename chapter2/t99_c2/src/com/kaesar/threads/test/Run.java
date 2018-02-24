package com.kaesar.threads.test;

/**
 * 运行结果是：不停地打印“run printStringMethod threadName=main”。 
 * 停不下来的主要原因是main线程一直在处理while()循环，导致程序不能继续执行后面的代码
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("我要停止它！ stopThread=" + Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
