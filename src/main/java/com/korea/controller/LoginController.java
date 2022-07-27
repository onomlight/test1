package com.korea.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements SubController {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.getRequestDispatcher("/WEB-INF/View/Login.jsp").forward(request, response);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
