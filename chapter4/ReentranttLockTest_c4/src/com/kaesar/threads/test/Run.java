package com.kaesar.threads.test;

/**
 * 运行代码可知：当前线程打印完毕之后将锁进行释放，其他线程才可以继续打印。线程打印的数据时分组打印，因为当前线程已经持有锁，但线程之间打印的顺序是随机的
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		MyThread thread1 = new MyThread(service);
		MyThread thread2 = new MyThread(service);
		MyThread thread3 = new MyThread(service);
		MyThread thread4 = new MyThread(service);
		MyThread thread5 = new MyThread(service);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
