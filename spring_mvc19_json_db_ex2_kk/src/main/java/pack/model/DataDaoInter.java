package pack.model;

import java.util.List;

public interface DataDaoInter {
	public List<SawonBuserGogekDto> selectByBuser(String buser_name);
	public List<SawonBuserGogekDto> selectBySawon(String sawon_name);
	public SawonBuserGogekDto loginkkk(String sawon_name, String sawon_no);
}
