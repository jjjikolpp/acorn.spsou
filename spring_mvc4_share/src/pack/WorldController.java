package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WorldController implements Controller {
	private SharedData data;
	
	public void setData(SharedData data) {
		this.data = data;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView view = new ModelAndView();
		view.addObject("msg", "world" + data.getShared());
		view.setViewName("list");
		
		return view;
	}
}
