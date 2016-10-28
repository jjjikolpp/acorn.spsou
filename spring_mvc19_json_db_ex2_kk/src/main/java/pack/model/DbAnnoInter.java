package pack.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface DbAnnoInter {
	
	@Select("select sawon_no, sawon_name, buser_tel, sawon_jik, count(gogek_damsano) as gogeksu from sawon "
			+ "left join buser on buser_no = buser_num "
			+ "left join gogek on gogek_damsano=sawon_no where buser_name=#{buser_name} group by sawon_no;")
	public List<SawonBuserGogekDto> all(String buser_name);
	
	@Select("select gogek_no, gogek_name, gogek_tel, gogek_jumin from sawon left join gogek on gogek_damsano=sawon_no where sawon_name=#{sawon_name}")
	public List<SawonBuserGogekDto> all2(String sawon_name);
	
	@Select("select * from sawon where sawon_name=#{sawon_name} and sawon_no=#{sawon_no}")
	public SawonBuserGogekDto loginkk(Map<String, String> map);
}
