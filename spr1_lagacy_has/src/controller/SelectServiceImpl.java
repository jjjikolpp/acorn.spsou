package controller;

import model.DataDao;

public class SelectServiceImpl implements SelectService {
	private DataDao dataDao;
	public SelectServiceImpl(DataDao dataDao) {
		//생성자를 통해인스턴스 주소 치환
		this.dataDao = dataDao;
	}
	
	@Override
	public void selectProcess() {
		System.out.println("selectProcess 수행");
		dataDao.selectData();
	}
}
