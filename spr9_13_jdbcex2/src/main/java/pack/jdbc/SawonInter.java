package pack.jdbc;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface SawonInter {
	List<SawonDto> selectSawonList() throws DataAccessException;
}
