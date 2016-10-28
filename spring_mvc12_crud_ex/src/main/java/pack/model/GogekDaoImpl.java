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
public class GogekDaoImpl extends JdbcDaoSupport implements GogekInter {
	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void init(){
		setDataSource(dataSource);
	}
	
	
	public List<GogekDto> getGogek(String sawon_no) {
		System.out.println("GogekDaoImpl / sawon_name : " + sawon_no);
		String sql = "select gogek_no, gogek_name,case substring(gogek_jumin,8,1) WHEN 1 THEN '남' WHEN 3 THEN '남' WHEN 2 THEN '여' WHEN 4 THEN '여' end as gogek_gen, case substring(gogek_jumin,8,1) WHEN 1 THEN YEAR(now()) - ((left(gogek_jumin,2) + 1900) ) WHEN 2 THEN YEAR(now()) - ((left(gogek_jumin,2) + 1900))WHEN 3 THEN YEAR(now()) - ((left(gogek_jumin,2) + 2000) ) WHEN 4 THEN YEAR(now()) - ((left(gogek_jumin,2) + 2000) ) end as gogek_age,gogek_tel from gogek left outer join sawon on gogek_damsano = sawon_no where sawon_no = ?";
		
		
			List<GogekDto> list = getJdbcTemplate().query(sql, new Object[] {sawon_no}, new RowMapper(){
	
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				GogekDto dto = new GogekDto();
				dto.setGogek_no(rs.getString(1));
				dto.setGogek_name(rs.getString(2));
				dto.setGogek_gen(rs.getString(3));
				dto.setGogek_age(rs.getString(4));
				dto.setGogek_tel(rs.getString(5));
				
				return dto;
			}
		});
			
		return list;
	}
}
