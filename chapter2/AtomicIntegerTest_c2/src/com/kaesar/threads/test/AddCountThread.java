package com.kaesar.threads.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子操作是不能分割的整体，没有其他线程能够中断或检查正在原子操作的变量。一个原子（atomic）类型就是一个原子操作可用的类型，
 * 它可以在没有锁的情况下租到线程安全。
 * @author chengkai
 *
 */
public class AddCountThread extends Thread {
	
	private AtomicInteger count = new AtomicInteger(0);
	
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println(count.incrementAndGet());
		}
	}

}
