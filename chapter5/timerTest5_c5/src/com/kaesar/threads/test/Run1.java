package com.kaesar.threads.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 方法 scheduleAtFixedRate(TimerTask task, Date firstTime, long period) 的测试：
 * 方法scheduleAtFixedRate和schedule主要的区别只在于不延时的情况：
 *     使用schedule方法：如果执行任务的时间没有被延时，那么下一次任务的执行时间参考的是上一次任务的“开始”时的时间来计算
 *     使用scheduleAtFixedRate方法：如果执行任务的时间没有被延时，那么下一次任务的执行时间参考的是上一次任务的“结束”时的时间来计算
 *
 * 1.测试schedule方法任务不延时
 * 
 * @author chengkai
 *
 */
public class Run1 {

	private static Timer timer = new Timer();
	private static int runCount = 0;
	
	static public class MyTask1 extends TimerTask {
		
		@Override
		public void run() {
			try {
				System.out.println("1 begin 运行了！时间为：" + new Date());
				Thread.sleep(1000);
				System.out.println("1 end 运行了！时间为：" + new Date());
				runCount++;
				if(runCount == 5) {
					timer.cancel();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2018-03-02 16:50:00";
			Date dateRef1 = sdf1.parse(dateString1);
			System.out.println("字符串1时间：" + dateRef1.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
			timer.schedule(task1, dateRef1, 3000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
