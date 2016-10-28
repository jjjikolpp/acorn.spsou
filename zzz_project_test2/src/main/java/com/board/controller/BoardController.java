package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.board.model.BoardDaoInter;

@Controller
public class BoardController {
	@Autowired
	private BoardDaoInter inter;
	
	@RequestMapping("list")
	public ModelAndView listAll(){
		return new ModelAndView("listpage","list",inter.listAll());
	}
}
