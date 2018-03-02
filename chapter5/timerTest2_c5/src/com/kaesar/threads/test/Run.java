package com.kaesar.threads.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 方法 schedule(TimerTask task, Date firstTime, long period) 的测试：该方法的作用是在指定的日期之后，按指定的间隔周期性的无限循环地执行某一任务
 * 
 * 1.计划时间晚于当前时间：在未来执行的效果
 * 2.计划时间早于当前时间：提前运行的效果，立即执行task任务
 * 
 * @author chengkai
 *
 */
public class Run {

	static public class MyTask extends TimerTask {
		 
		@Override
		public void run() {
			System.out.println("运行了！时间为：" + new Date());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-03-02 15:56:43";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
			Timer timer = new Timer();
			timer.schedule(task, dateRef, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
