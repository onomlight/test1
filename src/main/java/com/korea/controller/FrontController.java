package com.korea.controller;


import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	 
	HashMap<String, SubController> list = null;

	@Override
	public void init() throws ServletException 	 
	{
		list = new HashMap();
		list.put("/MemberJoin.do", new MemberJoinController());
		list.put("/login.do", new LoginController());
		
	}

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		String url = req.getRequestURI();
		System.out.println("URL : " + url);
		SubController sub = list.get(url);
		if (sub != null)
			sub.execute(req, resp);
	}
}
