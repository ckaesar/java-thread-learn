package com.kaesar.threads.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  类 SimpleDateFormat 在多线程环境下处理日期但是得出的结果却是错误的情况，这是在多线程环境开发中容易遇到的问题。
 * @author chengkai
 *
 */
public class MyThread extends Thread {

	private SimpleDateFormat sdf;
	private String dateString;
	
	public MyThread(SimpleDateFormat sdf, String dateString) {
		super();
		this.sdf = sdf;
		this.dateString = dateString;
	}
	
	@Override
	public void run() {
		try {
			Date dateRef = sdf.parse(dateString);
			String newDateString = sdf.format(dateRef).toString();
			if(!newDateString.equals(dateString)) {
				System.out.println("ThreadName=" + this.getName() + "报错了，日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
