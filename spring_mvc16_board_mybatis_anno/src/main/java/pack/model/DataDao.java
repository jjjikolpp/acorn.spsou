package pack.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import pack.controller.DataBean;

@Repository
public class DataDao implements DataDaoInter{
	@Autowired
	private DataAnnoInter dataAnnoInter;
	
	public List<DataDto> getListAll(PagingBean bean) throws DataAccessException {
		return dataAnnoInter.selectAllData(bean);
	}
	
	public int boardCount() throws DataAccessException {
		return dataAnnoInter.getBoardCount();
	}
	
	public DataBean detail(String num) throws DataAccessException {
		return dataAnnoInter.selectOne(num);
	}
	
	public boolean write(DataBean bean) throws DataAccessException {
		return dataAnnoInter.write(bean);
	}
	
	public void readcntUp(String num) throws DataAccessException {
		dataAnnoInter.readcntUp(num);
	}
	
	public boolean update(DataBean bean) throws DataAccessException {
		return dataAnnoInter.updateOk(bean);
	}
	
	public List<DataDto> authorSearch(String searchValue) throws DataAccessException {
		return dataAnnoInter.authorSearch(searchValue);
	}
	
	public List<DataDto> titleSearch(String searchValue) throws DataAccessException {
		return dataAnnoInter.titleSearch(searchValue);
	}
	
	public boolean delete(String num) throws DataAccessException {
		return dataAnnoInter.delete(num);
	}
	
	public int getGnum() throws DataAccessException {
		return dataAnnoInter.getGnum();
		
	}
	
	public boolean replay(DataBean bean) throws DataAccessException {
		return dataAnnoInter.replay(bean);
	}
	
	public void onumUp(DataBean bean) throws DataAccessException {
		dataAnnoInter.onumUp(bean);
	}
}
