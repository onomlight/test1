package com.korea.service;

import com.korea.dao.MemberDAO;
import com.korea.dto.MemberDTO;

public class MemberService {
	
	private static MemberService service = new MemberService();
	public MemberDAO dao = MemberDAO.getInstance();
	
	private MemberService(){}

	public static MemberService getInstance() {
		return service;
	}

	public boolean memberJoin(MemberDTO dto) {
		
		
		return dao.memberJoin(dto);
		//채우기
		
	}
}
