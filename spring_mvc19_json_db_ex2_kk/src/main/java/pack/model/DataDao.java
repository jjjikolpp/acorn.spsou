package pack.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataDao implements DataDaoInter {
	@Autowired
	private DbAnnoInter inter;
	
	@Override
	public List<SawonBuserGogekDto> selectByBuser(String buser_name) {
		return inter.all(buser_name);
	}
	
	@Override
	public List<SawonBuserGogekDto> selectBySawon(String sawon_name) {
		return inter.all2(sawon_name);
	}
	
	@Override
	public SawonBuserGogekDto loginkkk(String sawon_name, String sawon_no) {
		Map<String, String> map = new HashMap<>();
		map.put("sawon_name", sawon_name);
		map.put("sawon_no", sawon_no);
		return inter.loginkk(map);
	}
}
