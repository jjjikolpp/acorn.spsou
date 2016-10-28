package pack.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberImpl implements MemberInter {
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<MemberDto> getList() {
		String sql = "select * from mymember";
		List<MemberDto> list = template.query(sql, new RowMapper<MemberDto>(){
			@Override
			public MemberDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemberDto dto = new MemberDto();
				dto.setNo(rs.getString("no"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getString("age"));
				dto.setTel(rs.getString("tel"));
				return dto;
			}
		});
		return list;
	}
	
	@Override
	public void insert(MemberDto dto) {
		String sql = "insert into mymember values(?,?,?,?)";
//		template.update(sql, dto.getNo(),dto.getName(),dto.getAge(),dto.getTel());
		Object[] args = { dto.getNo(),dto.getName(),dto.getAge(),dto.getTel() };
		template.update(sql,args);
	}
	
	@Override
	public void update(MemberDto dto) {
		String sql = "update mymemeber set name=?,age=?,tel=? where no=?";
		Object[] args = { dto.getName(),dto.getAge(),dto.getTel(),dto.getNo() };
		template.update(sql,no);
		
	}
	
	@Override
	public void delete(String no) {
		String sql = "delete from mymember where no=?";
		template.update(sql,no);
	}
	
	@Override
	public MemberDto getData(String no) {
		String sql = "select * from mymember where no=?";
		BeanPropertyRowMapper mapper = new BeanPropertyRowMapper(MemberDto.class);
//		MemberDto dto = (MemberDto)template.queryForObject(sql, no);
		MemberDto dto = (MemberDto)template.queryForObject(sql, mapper,no);
		return dto;
	}
	
	
}
