package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("happy")
public class HappController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView andView = new ModelAndView();
		andView.addObject("message", "헤피 겟");
		andView.setViewName("view1");
		return andView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView andView = new ModelAndView();
		andView.addObject("message", "헤피 포스트");
		andView.setViewName("view1");
		return andView;
	}

}
