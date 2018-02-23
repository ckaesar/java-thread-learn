package com.kaesar.threads.test;

import com.kaesar.threads.test.OutClass.Inner;

/**
 * 运行结果发现：由于持有不同的“对象监视器”，所以打印结果是乱序的
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				inner.method1();
			}
		}, "A");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				inner.method2();
			}
		}, "B");
		
		t1.start();
		t2.start();
	}
}
