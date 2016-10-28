package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.MemDaoInter;
import pack.model.MemDto;

@Controller
public class UpdateController {
	@Autowired
	private MemDaoInter daoInter;
	
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ModelAndView up(@RequestParam("num")String num){
		List<MemDto> dto = daoInter.selectPart(num);
		System.out.println(dto.get(0).getName());
		System.out.println(dto.size());
		return new ModelAndView("upform","dto",dto);
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String submit(MemBean bean){
		boolean b = daoInter.updateData(bean);
		if(b)
			return "redirect:/list";
		else
			return "redirect:/error.jsp";
	}
}
