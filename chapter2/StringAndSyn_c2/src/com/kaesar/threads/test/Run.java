package com.kaesar.threads.test;

/**
 * 运行结果会不停的打印线程A的名称，出现这样的结果就是因为String的两个值都是AA，两个线程持有相同的锁，
 * 所以造成线程B不能执行。这就是String常量池所带来的问题。因此在大多数的情况下，同步synchronized
 * 代码块都不能使用String作为锁对象，而改用其他，比如new Object()实例化一个Object对象，但它并不放入缓存中。见项目StringAndSyn2_c2
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		
		ThreadA threadA = new ThreadA(service);
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service);
		threadB.setName("B");
		threadB.start();
	}
}
