package com.kaesar.threads.test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

	public static void main(String[] args) {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			
			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();
			
//			inputStream.connect(outputStream);
			outputStream.connect(inputStream); //使两个Stream之间产生通信链接，这样才可以将数据进行输入与输出
			
			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();
			
			Thread.sleep(2000);
			
			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
