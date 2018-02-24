package com.kaesar.threads.test;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA threadA = new ThreadA(service);
			threadA.start();
			Thread.sleep(1000);
			ThreadB threadB = new ThreadB(service);
			threadB.start();
			System.out.println("已经发起停止的命令了！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
