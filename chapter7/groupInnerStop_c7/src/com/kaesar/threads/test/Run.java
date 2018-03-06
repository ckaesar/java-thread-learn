package com.kaesar.threads.test;

/**
 * 组内的线程批量停止
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		try {
			ThreadGroup group = new ThreadGroup("我的线程组");
			for(int i = 0; i < 5; i++) {
				MyThread thread = new MyThread(group, "线程" + (i+1));
				thread.start();
			}
			
			Thread.sleep(5000);
			group.interrupt();
			System.out.println("调用了interrup()方法");
		} catch (InterruptedException e) {
			System.out.println("停了！");
			e.printStackTrace();
		}
	}
}
