package com.hi.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hi.model.BoardDaoInter;
import com.hi.model.BoardDto;

@Controller
public class DataController {
	@Autowired
	private BoardDaoInter inter;
	
	@RequestMapping("giftform")
	public ModelAndView giftPasing(){
		return new ModelAndView("giftform");
	}
	
//	@RequestMapping("listgogo")
//	public ModelAndView scroll(){
//		List<BoardDto> list = inter.selectFirstList();
//		
//		return new ModelAndView("listgogo", "flist", list);
//	}
}
