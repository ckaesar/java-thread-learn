package com.kaesar.threads.test;

/**
 * 覆盖initialValue()方法设置初始值
 * @author chengkai
 *
 */
public class ThreadLocalExt extends ThreadLocal {

	@Override
	protected Object initialValue() {
		return "我是默认值，第一次get不再为null";
	}
}
