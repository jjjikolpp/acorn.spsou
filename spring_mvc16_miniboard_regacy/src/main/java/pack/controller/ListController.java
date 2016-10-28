package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BoardDao;
import pack.model.BoardDto;

@Controller
public class ListController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("list")
	public ModelAndView listProcess(){
		List<BoardDto> list = boardDao.list();
		
		return new ModelAndView("list", "list", list);
	}
	
	@RequestMapping(value="write", method=RequestMethod.GET)
	public ModelAndView goToWriteForm(){
		return new ModelAndView("writeform");
	}
	
	@RequestMapping(value="write", method=RequestMethod.POST)
	public ModelAndView writeProcess(BoardBean bean){
		boolean b = boardDao.writeData(bean);
		List<BoardDto> list = boardDao.list();
		if (b) {
			return new ModelAndView("list","list", list);
		} else {

			return new ModelAndView("error");
		}
	}
	
	@RequestMapping("detail")
	public ModelAndView detailProcess(@RequestParam("num") String num){

		BoardDto dto = boardDao.detail(num);
		return new ModelAndView("detail","dto",dto);
	}
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public ModelAndView goToUpdateForm(@RequestParam("num") String num){
		BoardDto dto = boardDao.detail(num);
		return new ModelAndView("updateform","dto", dto);
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String updateProcess(@RequestParam("num")int num,@RequestParam("author") String author,@RequestParam("title")String title, @RequestParam("content") String content){
		BoardBean bean = new BoardBean();
		bean.setNum(num);
		bean.setAuthor(author);
		bean.setTitle(title);
		bean.setContent(content);
		boolean b = boardDao.updateData(bean);
		if (b) {
			return "redirect:/list";			
		} else {
			return "redirect:/error";
		}
	}
	
}
