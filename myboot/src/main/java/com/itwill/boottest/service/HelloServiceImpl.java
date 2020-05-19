package com.itwill.boottest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwill.boottest.mapper.HelloMapper;

@Service
public class HelloServiceImpl implements HelloService {
	@Autowired
	private HelloMapper helloMapper;

	@Override
	public int memberCount() throws Exception {
		return helloMapper.memberCount();
	}

}
