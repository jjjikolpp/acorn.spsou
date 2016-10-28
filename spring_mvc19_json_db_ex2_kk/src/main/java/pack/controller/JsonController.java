package pack.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pack.model.DataDao;
import pack.model.SawonBuserGogekDto;

@Controller
public class JsonController {
	
	@Autowired
	private DataDao inter;
	
	
	@RequestMapping("json")
	@ResponseBody
	public Map<String, Object> jsonjsonjson(@RequestParam("buser_name") String buser_name){
		
		List<Map<String, Object>> dataList = new ArrayList<>();
		Map<String, Object> data = null;
		
		List<SawonBuserGogekDto> datas = inter.selectByBuser(buser_name);
		
		for(SawonBuserGogekDto s : datas){
				data = new HashMap<>();
				data.put("gogeksu", s.getGogeksu());
				data.put("sawon_no", s.getSawon_no());
				data.put("sawon_name", s.getSawon_name());
				data.put("sawon_jik", s.getSawon_jik());
				data.put("buser_tel", s.getBuser_tel());
				data.put("buser_loc", s.getBuser_loc());
				data.put("buser_name", s.getBuser_name());
				data.put("gogek_name", s.getGogek_name());
				data.put("gogek_no", s.getGogek_no());
				dataList.add(data);
		}
		Map<String, Object> datata = new HashMap<>();
		datata.put("datas", dataList);
		
		return datata;
	}
	
	@RequestMapping("json2")
	@ResponseBody
	public Map<String, Object> json2(@RequestParam("sawon_name") String sawon_name){
		//System.out.println(sawon_name);
		List<Map<String, Object>> dataList = new ArrayList<>();
		Map<String, Object> data = null;
		
		List<SawonBuserGogekDto> datas = inter.selectBySawon(sawon_name);
		
		for(SawonBuserGogekDto s : datas){
				data = new HashMap<>();
				data.put("gogek_name", s.getGogek_name());
				data.put("gogek_no", s.getGogek_no());
				data.put("gogek_tel", s.getGogek_tel());
				data.put("gogek_jumin", s.getGogek_jumin());
				dataList.add(data);
		}
		Map<String, Object> datata = new HashMap<>();
		datata.put("datas", dataList);
		
		return datata;
	}
}
