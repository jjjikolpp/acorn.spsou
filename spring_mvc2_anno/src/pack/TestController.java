package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
	@RequestMapping("index.do")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// MVC 중 Controller 영역
		System.out.println("TestController 수행");
		//return new ModelAndView("list"); // view 파일명 반환
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("say", "버젼충돌 문제라고!!!"); //request.setAttribute("say", "버전충돌 문제네!!!");
		modelAndView.setViewName("list");
		return modelAndView;
	}
}
