package com.hi.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface BoardDaoInter {
	List<BoardDto> selectFirstList() throws DataAccessException;
}
