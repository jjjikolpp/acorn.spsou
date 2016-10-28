package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;

import pack.controller.DataBean;

public interface DataDaoInter {
	@Select("select * from springboard order by num desc")
	List<DataDto> getListAll(PagingBean bean) throws DataAccessException;
	DataBean detail(String num) throws DataAccessException;
	boolean write(DataBean bean) throws DataAccessException;
	boolean update(DataBean bean) throws DataAccessException;
	boolean delete(String num) throws DataAccessException;
	List<DataDto> authorSearch (String searchValue) throws DataAccessException;
	List<DataDto> titleSearch (String searchValue) throws DataAccessException;
	void readcntUp(String num) throws DataAccessException;
	int boardCount()throws DataAccessException;
	int getGnum()throws DataAccessException;
	boolean replay(DataBean bean)throws DataAccessException;
	void onumUp(DataBean bean)throws DataAccessException;
	
	// 댓글 //  들여쓰기 
	//paging
	
}
