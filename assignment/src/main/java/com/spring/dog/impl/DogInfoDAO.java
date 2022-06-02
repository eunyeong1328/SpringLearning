package com.spring.dog.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.spring.dog.common.JdbcUtil;

@Repository("DogInfoDAO")
public class DogInfoDAO {

	private Connection conn = null; 
	private PreparedStatement pstmt = null; 
	private ResultSet rs = null; 
	
	public void insertDogInfo(DogDO ddo) {
		
		try {
			conn = JdbcUtil.getConnection(); 
			String sql = "insert into doginfo(host, dogName, dogType, dogGender, dogInoculation) values" + "(?,?,?,?,?)"; 
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ddo.getHost());
			pstmt.setString(2, ddo.getDogName());
			pstmt.setString(3, ddo.getDogType());
			pstmt.setString(4, ddo.getDogGender());
			pstmt.setString(5, ddo.getDogInoculation());
			pstmt.executeUpdate(); //sql실행
			
			System.out.println("insert 데이터 실행 완료!");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		JdbcUtil.closeConnection(rs, pstmt, conn);
	}

}
