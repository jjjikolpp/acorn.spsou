package pack.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import pack.model.SawonDto;
import pack.model.SawonInter;


@Controller
public class SawonController {
	@Autowired
	@Qualifier("sawonImpl")
	private SawonInter sawonInter;
	
	@RequestMapping("sawon")
	public ModelAndView getList(HttpServletRequest request, HttpServletResponse response){	
	ModelAndView view = new ModelAndView();
	List<SawonDto> list = sawonInter.sawonList();
	view.setViewName("sawonlist");
	view.addObject("list", list);
	return view;
	}
}
