package pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
@Controller
public class LoginController {

	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView submit(HttpServletRequest request){
		String id = request.getParameter("id"); // request를 사용
		String pwd = request.getParameter("pwd");
		
		String data = "";
		if(id.equalsIgnoreCase("aa") && pwd.equals("11")){
			data = "로그인 성공";
		}else{
			data = "로그인 실패";
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showMessage");
		modelAndView.addObject("data", data);
		
		return modelAndView;
	}
}
*/
@Controller
@RequestMapping("login") // type level mapping
public class LoginController {
	@RequestMapping(method=RequestMethod.GET)  // method level mapping 
	//public ModelAndView submit(@RequestParam("id") String id, @RequestParam("pwd") String pwd){
	public ModelAndView submit(@RequestParam(value="id", required=true, defaultValue="aa") String id, 
							   @RequestParam("pwd") String pwd){  // int pwd  <<- 자동 형변환
		
		
		String data = "";
		if(id.equalsIgnoreCase("aa") && pwd.equals("11")){
			data = "로그인 성공";
		}else{
			data = "로그인 실패";
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showMessage");
		modelAndView.addObject("data", data);
		
		return modelAndView;
	}
}