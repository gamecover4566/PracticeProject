package com.itwill.boottest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class kakaoController {
	@RequestMapping("/logout")
	public String kakao_logout(HttpSession session) throws Exception {
		session.invalidate();
		
		return "hello";
	}
}
