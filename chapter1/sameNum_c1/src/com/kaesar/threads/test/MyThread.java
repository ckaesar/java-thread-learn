package com.kaesar.threads.test;

public class MyThread extends Thread {
	
	private int i = 5;
	
	@Override
	public void run() {
		System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
		//注意：代码 i-- 由前面项目中单独一行运行改成在当前项目中在println()方法中直接进行打印
	}
}
