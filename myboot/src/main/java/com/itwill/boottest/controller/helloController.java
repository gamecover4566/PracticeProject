package com.itwill.boottest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.boottest.mapper.HelloMapper;

@SuppressWarnings("unused")
@Controller
public class helloController {
	//@Autowired
	//private HelloMapper helloMapper;
	
	@RequestMapping("/hello")
	public String hello(HttpServletRequest request, HttpServletResponse response) {
		//Integer memberCount = helloMapper.memberCount();
		//request.setAttribute("memberCount", memberCount);
		
		return "hello";
	}
	
}
