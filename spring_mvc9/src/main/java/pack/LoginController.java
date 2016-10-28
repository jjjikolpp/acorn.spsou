package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@ModelAttribute("command") //  @ModelAttribute 는 다른 어노테이션보다 먼저 수행
	public LoginFormBean formBack(){
		//ㅇ어쩌구 저쩌구...
		
		return new LoginFormBean();
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String form(){
		return "loginform";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String submit(LoginFormBean formbean){
		if(formbean.getUserid().equals("aa") && formbean.getPasswd().equals("11")){
			return "redirect:/list"; // 목록보기
		}else{
			return "loginform"; //입력화면
		}
	}
}
