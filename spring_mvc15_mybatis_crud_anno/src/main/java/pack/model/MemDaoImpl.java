package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import pack.controller.MemBean;

@Repository
public class MemDaoImpl implements MemDaoInter{
	@Autowired
	private MemAnnoInter memAnnoInter;
	
	public List<MemDto> getDataAll() throws DataAccessException{
		return memAnnoInter.selectDataAll();
	}
	
	public List<MemDto> selectPart(String num) throws DataAccessException{
		return memAnnoInter.selectPart(num);
	}

	public boolean insertData(MemBean bean) {
		try {
			memAnnoInter.insertData(bean);
			return true;
		} catch (Exception e) {
			System.out.println("insertData : err" + e);
			return false;
		}
	}
	
	public boolean updateData(MemBean bean) {
		try {
			memAnnoInter.updateData(bean);
			return true;
		} catch (Exception e) {
			System.out.println("updateData err : " + e);
			return false;
		}
	}
	
	public boolean deleteData(String num) {
			boolean re = memAnnoInter.deleteData(num);
		if(re == true)
			return true;
		else
			return false;
		
	}
}
