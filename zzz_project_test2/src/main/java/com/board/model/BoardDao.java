package com.board.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao implements BoardDaoInter {
	@Autowired
	private BoardAnnoInter annoInter;
	
	@Override
	public List<BoardDto> listAll() throws DataAccessException {
		return annoInter.selectAllData();
	}

}
