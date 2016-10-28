package com.hi.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl implements BoardDaoInter {
	@Autowired
	private BoardAnnoInter boardAnnoInter;
	
	@Override
	public List<BoardDto> selectFirstList() throws DataAccessException{
		return boardAnnoInter.selectFirstList();
	}
	
}
