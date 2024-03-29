package com.spring.dog.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
	static String id = "root";
	static String password = "111111";
	static String url = "jdbc:mysql://localhost:3306/springdb?characterEncoding=UTF-8";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MYSQL DB �ε� �Ϸ�");
			
			conn = DriverManager.getConnection(url,id,password);
			return conn;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeConnection(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(pstmt != null) {
			try {
				pstmt.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if( rs != null) {
			try {
				rs.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
