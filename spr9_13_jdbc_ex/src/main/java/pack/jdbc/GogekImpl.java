package pack.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class GogekImpl extends JdbcDaoSupport implements GogekInter{
	@Override
	public List<GogekDto> selectMan() throws DataAccessException {
		RowMapper rowMapper = new GogekRowMapper();
		
		return getJdbcTemplate().query("select gogek_no,gogek_name,gogek_tel,case substring(gogek_jumin,8,1)when 1 then '남'when 3 then '남'when 2 then '여'when 4 then '여' end as 'gogek_gen' from gogek; ", rowMapper);
	}
	
	class GogekRowMapper implements RowMapper{
		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			System.out.println("rowNum : " + rowNum);
			GogekDto dto = new GogekDto();
			dto.setGogek_no(rs.getString("gogek_no"));
			dto.setGogek_name(rs.getString("gogek_name"));
			dto.setGogek_tel(rs.getString("gogek_tel"));
			dto.setGogek_gen(rs.getString("gogek_gen"));
			
			return dto;
		}
	}
}
