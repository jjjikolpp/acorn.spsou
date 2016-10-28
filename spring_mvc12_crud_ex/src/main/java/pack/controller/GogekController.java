package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.GogekDto;
import pack.model.GogekInter;

@Controller
public class GogekController implements GogekView{
	@Autowired
	GogekInter gogekInter;
	
	@RequestMapping("gogek")
	public ModelAndView getGogek(@RequestParam("sawon_name") String sawon_name,@RequestParam("sawon_no") String sawon_no) {
		List<GogekDto> list = gogekInter.getGogek(sawon_no);
		ModelAndView view = new ModelAndView();
		
		view.setViewName("gogekview");
		view.addObject("gogek_list", list);
		view.addObject("sawon_name", sawon_name);
				
		return view;
	}
}
