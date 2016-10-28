package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
@Controller
public class HelloController {
	//@RequestMapping("hello.do")
	@RequestMapping(value="hello.do", method=RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView andView = new ModelAndView();
		andView.addObject("message","어노 헬로우 - get");
		andView.setViewName("view1");
		return andView;
	}
	
	@RequestMapping(value="hello.do", method=RequestMethod.POST)
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView andView = new ModelAndView();
		andView.addObject("message","어노 헬로우 - post");
		andView.setViewName("view1");
		return andView;
	}
}
*/


@Controller
@RequestMapping({"hello*", "mbc/hi*"})
public class HelloController {
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView andView = new ModelAndView();
		andView.addObject("message","어노 헬로우 - get - ok");
		andView.setViewName("view1");
		return andView;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 수행");
		
		ModelAndView andView = new ModelAndView();
		andView.addObject("message","어노 헬로우 - post - ok");
		andView.setViewName("view1");
		return andView;
	}
}