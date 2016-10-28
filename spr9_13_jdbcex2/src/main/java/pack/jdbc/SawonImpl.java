package pack.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SawonImpl extends JdbcDaoSupport implements SawonInter{
	@Override
	public List<SawonDto> selectSawonList() throws DataAccessException {
		RowMapper rowMapper = new SawonRowmMapper();
		System.out.println("부서 번호를 입력");
		Scanner sc = new Scanner(System.in);
		String buser_no = sc.nextLine(); 
		
		
		return getJdbcTemplate().query("select sawon_no,sawon_name,buser_name,sawon_jik,buser_no from sawon left outer join buser on buser_num = buser_no"+buser_no, rowMapper);
	}
}
