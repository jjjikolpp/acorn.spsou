package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class DataDaoImpl extends SqlSessionDaoSupport implements DataDaoInter {
	@Autowired
	public DataDaoImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public List<SawonDto> selectSaonAll() throws DataAccessException{
		System.out.println("aa");
		return getSqlSession().selectList("selectSawonAll");
	}
}
