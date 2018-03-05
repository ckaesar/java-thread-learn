package com.kaesar.threads.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 单例模式-使用enum枚举数据类型实现单例模式
 * @author chengkai
 *
 */
public class MyObject {
	
	public enum MyEnumSingleton {
		connectionFactory;
		
		private Connection connection;
		
		private MyEnumSingleton() {
			try {
				System.out.println("调用MyObject的构造");
				String url = "jdbc:mysql://localhost:3306/test";
				String username = "root";
				String password = "root";
				String driverName = "com.mysql.jdbc.Driver";
				Class.forName(driverName);
				connection = DriverManager.getConnection(url, username, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public Connection getConnection() {
			return connection;
		}
	}
	
	public static Connection getConnection() {
		return MyEnumSingleton.connectionFactory.getConnection();
	}
	
}
