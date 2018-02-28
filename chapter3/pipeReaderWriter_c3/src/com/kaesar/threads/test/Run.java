package com.kaesar.threads.test;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {

	public static void main(String[] args) {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			
			PipedReader pipedReader = new PipedReader();
			PipedWriter pipedWriter = new PipedWriter();
			
//			pipedReader.connect(pipedWriter);
			pipedWriter.connect(pipedReader);
			
			ThreadRead threadRead = new ThreadRead(readData, pipedReader);
			threadRead.start();
			
			Thread.sleep(2000);
			
			ThreadWrite threadWrite = new ThreadWrite(writeData, pipedWriter);
			threadWrite.start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
