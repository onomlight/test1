package com.korea.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.korea.dto.MemberDTO;
import com.korea.service.MemberService;

public class MemberJoinController implements SubController {
	
	private MemberService service = MemberService.getInstance();
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		//채우기
		System.out.println("====MemberJoin Controller====");
		String flag=req.getParameter("flag");

		try {
			if(flag==null) {
				req.getRequestDispatcher("/WEB-INF/View/MemberJoin.jsp").forward(req, resp);
			}
			else
			{
				String userid = req.getParameter("userid");
				String pwd = req.getParameter("pwd");
				String name = req.getParameter("name");
				String ph1 = req.getParameter("ph1");
				String ph2 = req.getParameter("ph2");
				String ph3 = req.getParameter("ph3");
				String email = req.getParameter("email");
				String addr1 = req.getParameter("addr1");
				String addr2 = req.getParameter("addr2");
				int zipcode = Integer.parseInt(req.getParameter("zipcode"));
				
				MemberDTO dto = new MemberDTO();
				dto.setUserid(userid);
				dto.setPwd(pwd);
				dto.setName(name);
				dto.setPh1(ph1);
				dto.setPh2(ph2);
				dto.setPh3(ph3);
				dto.setEmail(email);
				dto.setAddr1(addr1);
				dto.setAddr2(addr2);
				dto.setZipcode(zipcode);
				
				boolean result = service.memberJoin(dto);
				
				resp.sendRedirect("/login.do");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
