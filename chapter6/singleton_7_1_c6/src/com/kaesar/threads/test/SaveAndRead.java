package com.kaesar.threads.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 运行程序发现不是同一个对象
 * 解决办法就是在反序列化中使用readResolve()方法，去掉MyObject中注释掉的代码，测试
 * @author chengkai
 *
 */
public class SaveAndRead {

	public static void main(String[] args) {
		try {
			MyObject myObject = MyObject.getInstance();
			FileOutputStream fosRef = new FileOutputStream(new File("myObjecttFile.txt"));
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
			oosRef.writeObject(myObject);
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fisRef = new FileInputStream(new File("myObjecttFile.txt"));
			ObjectInputStream iosRef = new ObjectInputStream(fisRef);
			MyObject myObject = (MyObject) iosRef.readObject();
			iosRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
 	}
}
