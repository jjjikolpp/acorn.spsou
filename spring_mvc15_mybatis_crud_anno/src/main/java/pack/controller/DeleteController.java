package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.MemAnnoInter;
import pack.model.MemDaoInter;

@Controller
public class DeleteController {
	@Autowired
	private MemAnnoInter annoInter;
	
	@RequestMapping("delete")
	public String del(@RequestParam("num")String num){
		if (annoInter.deleteData(num)) 
			return "redirect:/list";
		else
			return "redirect:/error.jsp";
		
		
	}
}
