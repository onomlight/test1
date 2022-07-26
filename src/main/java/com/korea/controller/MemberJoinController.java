package com.korea.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberJoinController implements SubController {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		//채우기
		
		try {
			request.getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
		
	}

