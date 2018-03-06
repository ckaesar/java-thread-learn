package com.kaesar.threads.test;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * 在Java的多线程技术中，可以对多线程中的异常进行“捕捉”，使用的是 java.lang.Thread.UncaughtExceptionHandler 类。从而可以对发生的异常进行有效的处理。
 * @author chengkai
 *
 */
public class Main2 {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("线程t1");
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程：" + t.getName() + "出现了异常：");
				e.printStackTrace();
			}
		});
		t1.start();
		MyThread t2 = new MyThread();
		t2.setName("线程t2");
		t2.start();
	}
}
