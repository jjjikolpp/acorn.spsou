package pack.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pack.model.DataInter;
import pack.model.SawonDto;

@Controller
public class SawonController {
	@Autowired
	private DataInter inter;
	
	@RequestMapping(value="sawon",method=RequestMethod.POST)
	@ResponseBody
	public SawonDto getSawon(@RequestParam("gogek_no")String gogek_no,
			@RequestParam("gogek_name")String gogek_name){
		
		FormBean bean = new FormBean();
		bean.setGogek_no(gogek_no);
		bean.setGogek_name(gogek_name);
		SawonDto data2 = inter.getSawon(bean);
		
		
//		Map<String, String>  data = new HashMap<String, String>();
//		data.put("sawon_name", dto.getSawon_name());
//		data.put("sawon_jik", dto.getSawon_jik());
//		data.put("buser_name", dto.getBuser_name());
//		data.put("buser_tel", dto.getBuser_tel());
//			
//		Map<String, Object> data2 = new HashMap<String, Object>();
//		data2.put("data", data);
		
		
		return data2;
	}
}
