package pack.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.MemDaoInter;
import pack.model.MemDto;

@Controller
public class ListController {
	@Autowired
	private MemDaoInter daonInter;
	
	@RequestMapping("list")
	public ModelAndView list(){
		ArrayList<MemDto> dd = (ArrayList<MemDto>)daonInter.getDataAll();
		return new ModelAndView("list", "list", daonInter.getDataAll());
	}
}
