package pack.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SawonRowmMapper implements RowMapper{
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("rowNum : " + rowNum);
		SawonDto dto = new SawonDto();
		dto.setSawon_no(rs.getString("sawon_no"));
		dto.setSawon_name(rs.getString("sawon_name"));
		dto.setBuser_name(rs.getString("buser_name"));
		dto.setSawon_jik(rs.getString("sawon_jik"));
		dto.setBuser_no(rs.getString("buser_no"));
		
		return dto;
	}
}
