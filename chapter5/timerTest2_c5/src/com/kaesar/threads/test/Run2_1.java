package com.kaesar.threads.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 方法 schedule(TimerTask task, Date firstTime, long period) 的测试：该方法的作用是在指定的日期之后，按指定的间隔周期性的无限循环地执行某一任务
 * 
 * 3.任务执行时间被延时
 * 
 * @author chengkai
 *
 */
public class Run2_1 {

	static public class MyTaskA extends TimerTask {
		
		@Override
		public void run() {
			try {
				System.out.println("A运行了！时间为：" + new Date());
				Thread.sleep(5000);
				System.out.println("A结束了！时间为：" + new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTaskA taskA = new MyTaskA();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-03-02 16:04:50";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
			Timer timer = new Timer();
			timer.schedule(taskA, dateRef, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
