package com.kaesar.threads.test;

/**
 * 运行结果是出现死循环：原因是各线程间的数据值没有可视性造成的，而关键字synchronized可以具有可视性
 * @author chengkai
 *
 */
public class Service {

	private boolean isContinueRun = true;
	
	public void runMethod() {
		String anyString = new String();
		while(isContinueRun == true) {
			//添加synchronized关键字
			synchronized (anyString) {
				
			}
		}
		System.out.println("停下来了！");
	}
	
	public void stopMethod() {
		isContinueRun = false;
	}
}
