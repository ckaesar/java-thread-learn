package com.kaesar.threads.test;

import com.kaesar.threads.test.OutClass.InnerClass1;
import com.kaesar.threads.test.OutClass.InnerClass2;

/**
 * 该实例测试同步代码块synchronized(class2)对class2上锁后，其他线程只能以同步的方式调用class2中的静态同步方法。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		final InnerClass1 in1 = new InnerClass1();
		final InnerClass2 in2 = new InnerClass2();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				in1.method1(in2);
			}
		}, "T1");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				in1.method2();
			}
		}, "T2");
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				in2.method1();
			}
		}, "T3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
