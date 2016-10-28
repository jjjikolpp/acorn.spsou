package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import model.DataDao;

public class CalcServiceImpl implements CalcService {
	private DataDao dataDao; 
	String [] total;
	
	public CalcServiceImpl(DataDao dataDao){
		this.dataDao = dataDao;
	}
	
	@Override
	public void calserviceinput() {
		String sang;
		int su,dan;
		
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader breader = new BufferedReader(reader);
			System.out.print("상품명을 입력하시오 : ");
			sang = breader.readLine();
			System.out.print("수량을 입력하시오 : ");
			su = Integer.parseInt(breader.readLine());
			System.out.print("단가을 입력하시오 : ");
			dan = Integer.parseInt(breader.readLine());
			
			total = dataDao.selectData(sang, su, dan);
			
		} catch (Exception e) {
			System.out.println("calserviceinput 에러 : " + e);
		}
		
	}
	
	@Override
	public void view() {
		
		System.out.println("상품명 " + total[0] + "의 가격은 " + total[1]);
		
	}
}



















