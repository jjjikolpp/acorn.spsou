package pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.model.SangpumModel;

@Controller
public class SangpumController {
	//모델 사용
	@Autowired
	private SangpumModel sangpumModel;
	
	@RequestMapping(value="sangpum", method=RequestMethod.POST)
	//public ModelAndView submit(SangpumBean bean){
	public ModelAndView submit(@ModelAttribute("my") SangpumBean bean){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showMessage");
		modelAndView.addObject("data", sangpumModel.compute(bean));
		
		return modelAndView;
	}
	
	@ModelAttribute("myList")
	public List<String> abc(){
		List<String> list = new ArrayList<String>();
		list.add("한국인");
		list.add("지구인");
		list.add("세계인");
		return list;
	}
}
