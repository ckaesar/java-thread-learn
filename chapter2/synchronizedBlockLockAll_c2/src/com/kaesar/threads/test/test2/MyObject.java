package com.kaesar.threads.test.test2;

/**
 * 验证：当其他线程执行x对象中synchronized同步方法时呈同步效果
 * @author chengkai
 *
 */
public class MyObject {

	synchronized public void speedPrintString() {
		System.out.println("speedPrintString___getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
		System.out.println("----------");
		System.out.println("speedPrintString releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
	}
}
