package com.kaesar.threads.test;

import java.util.Date;

/**
 * 覆盖initialValue()方法设置初始值
 * @author chengkai
 *
 */
public class ThreadLocalExt extends ThreadLocal {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
