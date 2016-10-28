package com.board.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardAnnoInter {
	
	@Select("select * from boardtest")
	public List<BoardDto> selectAllData();
}
