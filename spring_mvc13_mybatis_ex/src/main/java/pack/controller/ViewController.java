package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.DataDaoInter;
import pack.model.SawonDto;

@Controller
public class ViewController {
	@Autowired
	DataDaoInter dataDaoInter;
	
	@RequestMapping("sawonlist")
	public ModelAndView sawonViewAll(@RequestParam(value="buser_name", defaultValue="all") String buser_name) {
		System.out.println("buser_name : " + buser_name);
		if(buser_name.equals("all")){
			List<SawonDto> dto = dataDaoInter.selectSaonAll();
			
			dto.get(1).getSawon_name();
			return new ModelAndView("sawon_list","data", dto);
		}
		System.out.println("dd");
		return null;
	}
	
	
}
