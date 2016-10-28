package pack.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import pack.model.HelloModel;

@Controller
//@RequestMapping("hello.do")
@RequestMapping({"hello.do", "hi", "abc/world.do", "k*","mbc","sbs"})
public class HelloController {
	@Autowired
	private HelloModel helloModel;
	
	/*
	@RequestMapping(method = RequestMethod.GET)
	protected ModelAndView abc() {
		String result = helloModel.getGreeting(); // 모델과 통신
		ModelAndView modelAndView = new ModelAndView();  // forward ( 기본 값 )
		modelAndView.setViewName("hello");
		modelAndView.addObject("result" , result);
		
		return modelAndView;
	}
	*/
	/*
	@RequestMapping(method = RequestMethod.GET)
	protected Map<String, Object> abc() {
		String result = helloModel.getGreeting(); // 모델과 통신
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("result", result);
		// view 파일명은 요청명과 동일하게 작성해 준다.
		return map;
	}
	*/
	
	@RequestMapping(method = RequestMethod.GET)
	protected Model abc(Model model) {
		String result = helloModel.getGreeting(); // 모델과 통신
		
		model.addAttribute("result", result);
		
		// view 파일명은 요청명과 동일하게 작성해 준다.
		return model;
	}
}