package pack.sawon.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import pack.resource.SqlMapConfig;

@Repository
public class SawonDao implements DaoInter{
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	
	@Override
	public List<SawonDto> selectSawonAll() {
		SqlSession session = factory.openSession();
		List<SawonDto> list = null;
		
		try {
			list = session.selectList("selectSawonAll");
		} catch (Exception e) {
			System.out.println("pack.sawon.model.SawonDaoImpl / selectSawonAll() err :" + e);
		}finally {
			if (session != null) session.close();
		}
		
		return list;
	}
	
}
