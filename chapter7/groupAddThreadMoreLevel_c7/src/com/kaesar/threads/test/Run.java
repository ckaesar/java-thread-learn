package com.kaesar.threads.test;

/**
 * 线程对象关联线程组：多级关联
 * 所谓的多级关联就是父对象中有子对象，子对象中再创建子对象，也就是出现子孙对象的效果了。但是此种写法在开发中不太常见，如果线程树结构
 * 设计的非常复杂反而不利于线程对象的管理，但JDK却提供了支持多级关联的线程树结构。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		//在main组中添加一个线程组A，然后在这个A组中添加线程对象Z
		//方法activeGroupCount()和activeCount()的值不是固定的
		//是系统中环境的一个快照
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					System.out.println("runMethod!");
					Thread.sleep(10000); //线程必须在运行状态才可以受组管理
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread newThread = new Thread(group, runnable);
		newThread.setName("Z");
		newThread.start(); //线程必须启动然后才归到组A中
		
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main线程中有多少个子线程组：" + listGroup.length + " 名字为： " + listGroup[0].getName());
		Thread[] listtThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listtThread);
		System.out.println(listtThread[0].getName());
	}
}
