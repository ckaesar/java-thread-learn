package com.kaesar.threads.test;

/**
 * 运行程序发现：会输出空指针异常。
 * @author chengkai
 *
 */
public class Main1 {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
