package pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GogekController {
	
	@RequestMapping("gogek")
	public String gogek(HttpServletRequest request){
		return "gogek";
	}
}
