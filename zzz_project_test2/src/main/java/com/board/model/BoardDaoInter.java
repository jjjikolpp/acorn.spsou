package com.board.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface BoardDaoInter {
	List<BoardDto> listAll() throws DataAccessException; 
}
