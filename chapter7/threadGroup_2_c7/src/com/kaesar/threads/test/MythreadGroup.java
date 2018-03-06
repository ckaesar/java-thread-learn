package com.kaesar.threads.test;

/**
 * 实现线程组内一个线程出现异常后全部线程都停止
 * @author chengkai
 *
 */
public class MythreadGroup extends ThreadGroup {

	public MythreadGroup(String name) {
		super(name);
	}
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		this.interrupt();
	}
}
