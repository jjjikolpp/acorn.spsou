package pack;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public String submit(@Validated @ModelAttribute("command") LoginFormBean formbean,
			BindingResult result){
		//BindingResult : 입력자료 오류 검사 수행
		if(formbean.getUserid().equals("aa") && formbean.getPasswd().equals("11")){
			//컨트롤러 내에서 강제 에러 발생 - Exception test
//			int a = 10 / 0;
//			int a = 10/3;
			return "redirect:/list"; // 목록보기
		}else{
			return "loginform"; //입력화면
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setValidator(new DataValidator());
	}
}
