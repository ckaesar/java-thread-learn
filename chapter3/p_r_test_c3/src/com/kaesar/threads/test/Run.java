package com.kaesar.threads.test;

/**
 * 本示例是1个生产者和1个消费者进行数据的交互，在控制台中打印的日志get和set是交替运行的。
 * @author chengkai
 *
 */
public class Run {

	public static void main(String[] args) {
		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);
		ThreadP threadP = new ThreadP(p);
		ThreadC threadC = new ThreadC(r);
		threadP.start();
		threadC.start();
	}
}
