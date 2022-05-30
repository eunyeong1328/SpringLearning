package com.spring.dog.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.spring.dog.common.JdbcUtil;

public class DogInfoDAO {

	private Connection conn = null; //����
	private PreparedStatement pstmt = null; //���� ����,����
	private ResultSet rs = null; //ó����� ����
	
	//DO�� �Ѿ���� �����͸� �޾Ƽ� DB�� ����
	public void insertDogInfo(DogDO ddo) {
		
		try {
			conn = JdbcUtil.getConnection(); //db����
			String sql = "insert into doginfo(host, dogName, dogType, dogGender) values" + "(?,?,?,?)"; //sql�� �ϼ�
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ddo.getHost());
			pstmt.setString(2, ddo.getDogName());
			pstmt.setString(3, ddo.getDogType());
			pstmt.setString(4, ddo.getDogGender());
			
			pstmt.executeUpdate(); //sql����
			
			System.out.println("insertBoard() ���� �Ϸ�!");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		JdbcUtil.closeConnection(rs, pstmt, conn);
	}

}
