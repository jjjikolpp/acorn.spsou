package pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import pack.model.HelloModel;

/*
public class HelloController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
*/

public class HelloController extends AbstractController{
	private HelloModel helloModel;
	
	public void setHelloModel(HelloModel helloModel) {
		this.helloModel = helloModel;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String result = helloModel.getGreeting(); // 모델과 통신
		
//		ModelAndView modelAndView = new ModelAndView("hello");  // forward ( 기본 값 )
		ModelAndView modelAndView = new ModelAndView();  // forward ( 기본 값 )
		modelAndView.setViewName("hello");
//		modelAndView.setViewName("redirect:/hello.jsp"); // redirect 방식
		modelAndView.addObject("result" , result);
		System.out.println(result);
		return modelAndView;
	}
}