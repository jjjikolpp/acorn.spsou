package com.hi.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;

public interface BoardAnnoInter {
	@Select("select * from boardtest order by b_no1 desc limit 0, 20")
	public List<BoardDto> selectFirstList();
}
