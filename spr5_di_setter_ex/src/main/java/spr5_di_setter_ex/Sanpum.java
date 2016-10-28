package spr5_di_setter_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sanpum {
	public String[] Sangin(){
		String [] arr = new String[3];
		
		try {
			
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader breader = new BufferedReader(reader);
			
			System.out.println("상품명 입력");
			String sang = breader.readLine();
			System.out.println("단가 입력");
			String dan = breader.readLine();
			System.out.println("수량 입력");
			String su = breader.readLine();
			
			arr[0] = sang;
			arr[1] = dan;
			arr[2] = su;
		} catch (Exception e) {
			System.out.println("Sangin err : " + e);
		}
		return arr;
	}
}
