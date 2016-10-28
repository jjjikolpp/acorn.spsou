package pack.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SawonDaoImpl extends JdbcDaoSupport implements SawonInter {
//	@Autowired
//	private DataSource dataSource;
//	
//	@PostConstruct
//	public void init(){
//		setDataSource(dataSource);
//	}
	
	@Autowired
	public SawonDaoImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public List<SawonDto> getSawonListAll() {
		String sql = "select sawon_no,sawon_name,sawon_jik,buser_name,if (count(gogek_name) >0,'o','x' ) as gogek"
			+" from sawon left outer join buser on buser_num = buser_no left outer join gogek on sawon_no = gogek_damsano group by sawon_name order by sawon_no";
		
		List<SawonDto> list = getJdbcTemplate().query(sql, new RowMapper(){
			
			
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				SawonDto dto = new SawonDto();
				dto.setSawon_no(rs.getString("sawon_no"));
				dto.setSawon_name(rs.getString("sawon_name"));
				dto.setSawon_jik(rs.getString("sawon_jik"));
				dto.setBuser_name(rs.getString("buser_name"));
				dto.setGogek(rs.getString("gogek"));
				return dto;
			}
		});
		return list;
	}	
}
