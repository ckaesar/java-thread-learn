package com.kaesar.threads.test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 程序运行后发现：打印顺序出错了，应该每加1次100再加1次1。出现这样的情况是因为addAndGet()方法是原子的，但方法和方法之间的调用却不是原子的。解决这样的问题要用同步。
 * @author chengkai
 *
 */
public class MyService {

	public static AtomicLong aiRef = new AtomicLong();
	
	synchronized public void addNum() { //添加synchronized关键字，同步
//	public void addNum() {
		System.out.println(Thread.currentThread().getName() + "加了100之后的值是：" + aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}
}
