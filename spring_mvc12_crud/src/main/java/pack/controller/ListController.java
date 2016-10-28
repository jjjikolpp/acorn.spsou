package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.MemberDao;
import pack.model.MemberDto;

@Controller
public class ListController {
	@Autowired
	private MemberDao memberDao;
	/*
	@RequestMapping("list")
	public ModelAndView listProcess(){
		List<MemberDto> list = memberDao.getMemberList();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("list", list);
	
		return view;
	}
	*/
	
	//paging
	private int pageSize = 3; // 한 페이지 당 출력 행 수
	@RequestMapping("list") //list?pagenum=1
	public ModelAndView listProcess(
			@RequestParam(value="pagenum", defaultValue="1")String pagenum){
		int currentPage = Integer.parseInt(pagenum);
		int startRow = (currentPage -1) * pageSize; //0, 3, 6...
		int endRow = pageSize;
		int count = memberDao.getMemberCount();
		
		List<MemberDto> list = memberDao.getMemberList(startRow,endRow);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("list", list);
		view.addObject("currentPage", currentPage);
		view.addObject("count", count);
		view.addObject("pageSize", pageSize);
		
		
	
		return view;
	}
}
