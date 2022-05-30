package com.spring.dog.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.spring.dog.common.JdbcUtil;

public class DogInfoDAO {

	private Connection conn = null; //연결
	private PreparedStatement pstmt = null; //쿼리 구성,실행
	private ResultSet rs = null; //처리결과 저장
	
	//DO로 넘어오는 데이터를 받아서 DB에 저장
	public void insertDogInfo(DogDO ddo) {
		
		try {
			conn = JdbcUtil.getConnection(); //db연결
			String sql = "insert into doginfo(host, dogName, dogType, dogGender) values" + "(?,?,?,?)"; //sql문 완성
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ddo.getHost());
			pstmt.setString(2, ddo.getDogName());
			pstmt.setString(3, ddo.getDogType());
			pstmt.setString(4, ddo.getDogGender());
			
			pstmt.executeUpdate(); //sql실행
			
			System.out.println("insertBoard() 실행 완료!");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		JdbcUtil.closeConnection(rs, pstmt, conn);
	}

}
