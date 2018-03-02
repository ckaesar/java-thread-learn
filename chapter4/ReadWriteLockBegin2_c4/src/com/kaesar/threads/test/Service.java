package com.kaesar.threads.test;

/**
 * 读写锁 ReentrantReadWriteLock ：可以加快运行效率，在某些不需要操作实例变量的方法中，完全可以使用读写锁ReentrantReadWriteLock来提升该方法的代码运行速度。
 * 读写锁表示也有两个锁，一个是读操作相关的锁，也成为共享锁；另一个是写操作相关的锁，也叫拍他锁。
 * 多个读锁之间不互斥，读锁与写锁互斥，写锁与写锁互斥。
 * 
 * 在没有线程Thread进行写入操作时，进行读取操作的多个Thread都可以获取读锁，而进行写入操作的Thread只有在获取写锁后才能进行写入操作。即多个Thread可以同时进行读取操作，但是同一时刻只允许一个Thread进行写入操作。
 */
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void write() {
		try {
			try {
				lock.writeLock().lock();
				System.out.println("获得写锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(10000);
				System.out.println("sleep end time=" + System.currentTimeMillis() + " " + Thread.currentThread().getName()); 
			} finally {
				lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
