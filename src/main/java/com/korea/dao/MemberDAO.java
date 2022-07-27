package com.korea.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.MemberDTO;

 

public class MemberDAO {
	private static MemberDAO dao = new MemberDAO();
	//채우기
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "c##book_ex";
	private String pw = "1234";
	
	private Connection conn=null;
	private PreparedStatement pstmt =null;
	private ResultSet rs = null;
	
	private static MemberDAO instance;
	public static MemberDAO getInstance() {
		if(instance==null);
		instance=new MemberDAO();
		return instance;
	}
	private MemberDAO(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DBConnected..");
		}catch(Exception e) {e.printStackTrace();}
	}

	public boolean memberJoin(MemberDTO member)
	{
		try {
			pstmt=conn.prepareStatement("insert into member_tbl values(?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, member.getUserid());
			pstmt.setString(2, member.getPwd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPh1());
			pstmt.setString(5, member.getPh2());
			pstmt.setString(6, member.getPh3());
			pstmt.setString(7, member.getEmail());
			pstmt.setInt(8, member.getZipcode());
			pstmt.setString(9, member.getAddr1());
			pstmt.setString(10, member.getAddr2());
			
			int result = pstmt.executeUpdate();
			if(result>0)
				return true;

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{pstmt.close();}catch(Exception e1) {e1.printStackTrace();}
		}
		
		return false;
	}
	
}
