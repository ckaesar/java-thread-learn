package com.kaesar.threads.test.test3;

/**
 * 验证：当其他线程执行x对象方法里面的synchronized(this)代码块时也呈现同步效果
 * @author chengkai
 *
 */
public class MyObject {

	public void speedPrintString() {
		synchronized(this) {
			System.out.println("speedPrintString___getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
			System.out.println("----------");
			System.out.println("speedPrintString releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
		}
	}
}
