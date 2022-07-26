package com.korea.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.korea.dto.MemberDTO;

 

public class MemberDAO {
	
	//채우기
	
	private static MemberDAO dao = new MemberDAO();
	DBConnectionMgr pool = DBConnectionMgr.getInstance();
	private MemberDAO(){}

	public static MemberDAO getInstance() {
		return dao;
	}
	
	public void memberJoin(MemberDTO member) {
		//채우기
	}
}
