package com.kaesar.threads.test;

/**
 * 运行后：cmd命令执行“jps”查看运行的id，然后执行“jstack -l id”查看可知有死锁
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			DeadThread t1 = new DeadThread();
			t1.setFlag("a");
			Thread thread1 = new Thread(t1);
			thread1.start();
			Thread.sleep(100);
			t1.setFlag("b");
			Thread thread2 = new Thread(t1);
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
