package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.DataDaoInter;
import pack.model.DataDto;
import pack.model.PagingBean;

@Controller
public class DataController {
	@Autowired
	private DataDaoInter inter;
	
	private int pageSize = 4;
	@RequestMapping("list")
	public ModelAndView viewList(@RequestParam(value="pagenum", defaultValue="1")String pagenum){
		int currentPage = Integer.parseInt(pagenum);
		int stirngStartRow = (currentPage -1) * pageSize;
		int stringEndRow = pageSize;
		int count = inter.boardCount();
		
		PagingBean bean = new PagingBean();
		
		String startRow = Integer.toString(stirngStartRow);
		String endRow = Integer.toString(stringEndRow);
		bean.setStartRow(startRow);
		bean.setEndRow(endRow);
		
		List<DataDto> dto = inter.getListAll(bean);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("dto", dto);
		view.addObject("currentPage", currentPage);
		view.addObject("count",count);
		view.addObject("pageSize", pageSize);
		
		return view;
	}
	
	@RequestMapping("detail")
	public ModelAndView viewOne(@RequestParam("num")String num){
		inter.readcntUp(num);
		return new ModelAndView("detail","data",inter.detail(num));
	}
	
	@RequestMapping(value="write", method=RequestMethod.GET)
	public ModelAndView writeForm(){
		return new ModelAndView("write");
	}
	
	@RequestMapping(value="write", method=RequestMethod.POST)
	public String write(@RequestParam("author")String author ,
			@RequestParam("title")String title,
			@RequestParam("content")String content){
		DataBean bean = new DataBean();
		bean.setAuthor(author);
		bean.setTitle(title);
		bean.setContent(content);
		bean.setGnum(inter.getGnum()+1);
		boolean b = inter.write(bean);
		
		if (b) {
			return "redirect:/list";
		} else {
			return "error";
		}
	}

	@RequestMapping(value="update",method=RequestMethod.GET)
	public ModelAndView updateForm(@RequestParam("num")String num){
		return new ModelAndView("update","data",inter.detail(num));
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String updateOk(@RequestParam("author")String author ,
			@RequestParam("title")String title,
			@RequestParam("content")String content,
			@RequestParam("num") String num){
		DataBean bean = new DataBean();
		bean.setAuthor(author);
		bean.setTitle(title);
		bean.setContent(content);
		bean.setNum(Integer.parseInt(num));
		
		boolean b = inter.update(bean);
		if (b) {
			return "redirect:/list";
		} else {
			return "error";
		}
	}

	@RequestMapping("search")
	public ModelAndView search(@RequestParam("searchList") String searchList,
			@RequestParam("searchValue") String searchValue){
		if (searchList.equals("author")) {
			return new ModelAndView("list","dto",inter.authorSearch(searchValue));
			
		} else if(searchList.equals("title")){
			return new ModelAndView("list","dto",inter.titleSearch(searchValue));
		}else{
			return new ModelAndView("error");
		}
	}
	
	@RequestMapping("delete")
	public String deleteOk(String num){
		boolean b = inter.delete(num);
		if (b) {
			return "redirect:/list";
		} else {
			return "redirect:/error";
		}
	}

	@RequestMapping(value="replay",method=RequestMethod.GET)
	public ModelAndView replayform(@RequestParam("num")String num,
			@RequestParam("gnum")String gnum,
			@RequestParam("onum")String onum,
			@RequestParam("nested")String nested
			){
		DataBean bean = new DataBean();
		bean.setNum(Integer.parseInt(num));
		bean.setGnum(Integer.parseInt(gnum));
		bean.setOnum(Integer.parseInt(onum));
		bean.setNested(Integer.parseInt(nested));
		
		return new ModelAndView("replay","bean" , bean);
	}
	
	@RequestMapping(value="replay",method=RequestMethod.POST)
	public String replayOk(@RequestParam("num")String num,
			@RequestParam("gnum") String gnum,
			@RequestParam("onum") String stringOnum,
			@RequestParam("nested") String nested,
			@RequestParam("author")String author,
			@RequestParam("title")String title,
			@RequestParam("content")String content){
		DataBean bean = new DataBean(); 
//		bean.setNum(Integer.parseInt(num));
		int onum;
		if (Integer.parseInt(stringOnum) > 0) {
			onum = Integer.parseInt(stringOnum) + 1;
		} else {
			onum = 0;
		}
		bean.setGnum(Integer.parseInt(gnum));
		bean.setOnum(onum);
		bean.setNested(Integer.parseInt(nested)+1);
		bean.setAuthor(author);
		bean.setTitle(title);
		bean.setContent(content);
//		inter.onumUp(bean); // onumUp
		boolean b = inter.replay(bean);
		if (b) {
			return "redirect:/list";
		} else {
			return "error";
		}		
	}


}
































