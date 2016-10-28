package pack.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.SawonDaoImpl;
import pack.model.SawonDto;
import pack.model.SawonInter;


@Controller
public class SawonController implements ViewInter {
	@Autowired
	SawonInter sawonInter;
	
	@RequestMapping("sawonlist")
	public ModelAndView viewSawon() {
		ArrayList<SawonDto> list = (ArrayList<SawonDto>)sawonInter.getSawonListAll();
		list.get(1).getBuser_name();
		return new ModelAndView("sawon", "sawon_list", list);
	}
}
	
	
	
