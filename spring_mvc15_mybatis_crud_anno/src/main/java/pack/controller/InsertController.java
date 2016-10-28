package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.model.MemAnnoInter;
import pack.model.MemDaoInter;

@Controller
public class InsertController {
	@Autowired
	private MemAnnoInter annoInter;
	
	@ModelAttribute("command")
	public MemBean formBack(){
		return new MemBean();
	}
	
	@RequestMapping(value="insert", method=RequestMethod.GET)
	public String insert(){
		return "insform";
	}
	
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public String submit(MemBean bean){
		boolean b = annoInter.insertData(bean);
		if(b)
			return "redirect:/list";
		else
			return "redirect:/error.jsp";
	}
}
