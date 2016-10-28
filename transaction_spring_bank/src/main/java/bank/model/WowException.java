package bank.model;

import org.springframework.dao.DataAccessException;

public class WowException extends DataAccessException{
	public WowException(String msg) {
		super("이런 에러! : " + msg);
	}
}
