package pack.model;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import pack.controller.FormBean;

@Repository
public class DataDao extends SqlSessionDaoSupport implements DataInter{
	@Autowired
	public DataDao(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public SawonDto getSawon(FormBean bean) throws DataAccessException {
		System.out.println(bean.getGogek_no() + " " +  bean.getGogek_name());
		return getSqlSession().selectOne("selectSawon",bean);
	}
}
