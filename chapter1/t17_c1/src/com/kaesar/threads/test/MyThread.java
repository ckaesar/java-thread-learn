package com.kaesar.threads.test;

/**
 * yield()方法：作用是放弃当前的CPU资源，将它让给其他的任务去占用CPU执行时间。但放弃的时间不确定，有可能马上放弃，马上又获得CPU时间片
 * @author chengkai
 *
 */
public class MyThread extends Thread {
	
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for(int i = 0; i < 50000000; i++) {
			Thread.yield(); //将CPU让给其他资源导致速度变慢。 注掉这行代码对比一下
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("用时：" + (endTime - beginTime) + "毫秒！");
	}

}
