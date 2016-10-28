package pack.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pack.controller.MemberBean;

@Repository
public class MemberDao extends JdbcDaoSupport {
	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void init() {
		setDataSource(dataSource);
	}

	// 전체 자료 읽기
	// public List<MemberDto> getMemberList(){
	// String sql = "select * from member";
	//
	// List<MemberDto> list = getJdbcTemplate().query(sql, new RowMapper(){
	//
	// public Object mapRow(ResultSet rs, int arg1) throws SQLException {
	// MemberDto dto = new MemberDto();
	// dto.setId(rs.getString("id"));
	// dto.setPasswd(rs.getString("passwd"));
	// dto.setName(rs.getString("name"));
	// dto.setReg_date(rs.getString("reg_date"));
	//
	// return dto;
	// }
	// });
	// return list;
	// }

	public List<MemberDto> getMemberList(int startRow, int endRow) { //(paging)
		String sql = "select * from member order by id desc limit ?,?";

		List<MemberDto> list = getJdbcTemplate().query(sql,new Object[]{startRow, endRow}, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				MemberDto dto = new MemberDto();
				dto.setId(rs.getString("id"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setName(rs.getString("name"));
				dto.setReg_date(rs.getString("reg_date"));

				return dto;
			}
		});
		return list;
	}

	public int getMemberCount() { // 전체 건수(paging)
		String sql = "select count(*) from member";
		return getJdbcTemplate().queryForObject(sql, Integer.class);
	}

	public void insData(MemberBean bean) { // 추가
		String sql = "insert into member values(?,?,?,now())";
		Object[] params = { bean.getId(), bean.getPasswd(), bean.getName() };
		getJdbcTemplate().update(sql, params);
	}

	public void upData(MemberBean bean) { // 수정
		String sql = "update member set passwd=?, name=? where id=?";
		getJdbcTemplate().update(sql, new Object[] { bean.getPasswd(), bean.getName(), bean.getId() });
	}

	public void delData(String id) { // 삭제
		String sql = "delete from member where id=?";
		getJdbcTemplate().update(sql, new Object[] { id });
	}

	// 부분 자료 읽기
	public MemberDto getMember(String id) {
		String sql = "select * from member where id=?";

		MemberDto dto = (MemberDto) getJdbcTemplate().queryForObject(sql, new Object[] { id }, new RowMapper() {

			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				MemberDto dto = new MemberDto();
				dto.setId(rs.getString("id"));
				dto.setPasswd(rs.getString("passwd"));
				dto.setName(rs.getString("name"));
				dto.setReg_date(rs.getString("reg_date"));

				return dto;
			}
		});
		return dto;
	}
}
