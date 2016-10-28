package pack.jdbc;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface GogekInter {
	List<GogekDto> selectMan() throws DataAccessException;
}
