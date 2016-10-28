package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

import pack.controller.SangpumBean;

public interface DataInter {
	List<SangpumDto> list() throws DataAccessException;
	List<SangpumDto> search(SangpumBean bean) throws DataAccessException;
}
