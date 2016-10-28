package pack.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.DataDaoInter;
import pack.model.SawonBuserGogekDto;

@Controller
public class LoginController {
	
	@Autowired
	private DataDaoInter inter;
	
	@RequestMapping("login")
	public String kkk(@RequestParam("sawon_name") String name, @RequestParam("sawon_no") String no, HttpSession session){
		String a = "";
		SawonBuserGogekDto dto = inter.loginkkk(name, no);
		if(dto != null){
			if(dto.getSawon_name() != null){
				session.setAttribute("login","yes");
				a= "gogek";
			}else{
				a= "redirect:gogek";
			}
		}else{
			a= "redirect:gogek";
		}
		return a;
	}
}
