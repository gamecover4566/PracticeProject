package com.itwill.boottest.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper {
	public int memberCount();
}
