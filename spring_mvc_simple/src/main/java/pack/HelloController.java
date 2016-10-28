package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping({"he*"})
	public ModelAndView abc(){
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "success");
		return view;
	}
}
