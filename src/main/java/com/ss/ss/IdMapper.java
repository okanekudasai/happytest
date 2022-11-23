package com.ss.ss;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IdMapper {

	List<idDto> getting();
	
}
