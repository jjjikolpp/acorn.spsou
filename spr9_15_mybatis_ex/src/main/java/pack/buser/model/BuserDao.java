package pack.buser.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import pack.resource.SqlMapConfig;

@Repository
public class BuserDao implements BuserInter{
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	@Override
	public List<BuserDto> selectBuser() {
		SqlSession session = factory.openSession();
		List<BuserDto> list = null;
		
		try {
			list = session.selectList("buserList");
		} catch (Exception e) {
			System.out.println("pack.buser.model.BuserDao / selectBuser" + e);
		}finally {
			if(session != null) session.close();
		}
		
		return list;
	}
}
