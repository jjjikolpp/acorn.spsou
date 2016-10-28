package model;

public class DataDaoImpl implements DataDao {
	
	@Override
	public String[] selectData(String sang, int su, int dan) {
		String [] str = new String[2];
		str[0] = sang;
		str[1] = String.valueOf(su*dan);
		return str;
	}
}
