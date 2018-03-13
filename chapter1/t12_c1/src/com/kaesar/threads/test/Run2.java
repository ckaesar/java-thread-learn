package com.kaesar.threads.test;

/**
 * this.interrupted()方法：测试当前线程是否已经是中断状态，执行后具有将状态标志置清除为false的功能
 * this.isInterrupted()方法：测试线程Thread对象是否已经是中断状态，但不清除状态标志
 * @author chengkai
 *
 */
public class Run2 {

	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("是否停止1？ = " + Thread.interrupted());
		System.out.println("是否停止2？ = " + Thread.interrupted());
		System.out.println("end!");
	}
}
