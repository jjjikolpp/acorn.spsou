package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorldController {
	//@RequestMapping("world")
	//@RequestMapping({"world","/world2","/good"})
	@RequestMapping({"world*","/good"})
	public ModelAndView kbs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("WorldController 수행");
		
		ModelAndView andView = new ModelAndView();
		andView.addObject("message","어노 월드");
		andView.setViewName("view2");
		return andView;
	}
}
