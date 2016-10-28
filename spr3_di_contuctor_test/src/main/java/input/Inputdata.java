package input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Calc.Calc;

public class Inputdata implements InputInter{
	private int money = 0, su = 0, total = 0;
	private String name = "";
	private Calc calc;
	
	public Inputdata(Calc calc) {
		this.calc = calc;
	}
	
	public void inputdata(){
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader breader = new BufferedReader(reader);
		try {
			System.out.println("품목을 입력하세요");
			name = breader.readLine();
			System.out.println("수량을 입력하세요");
			su = Integer.parseInt(breader.readLine());
			System.out.println("가격을 입력하세요");
			money = Integer.parseInt(breader.readLine());
			total = calc.totalCalc(money, su);
		} catch (Exception e) {
			System.out.println("inputdata err : " + e);
		}
		
	}
	
	public void showdata(){
		System.out.println("주문하신 상품은 : " + name);
		System.out.println(name + "의  주문수량은 : " + su);
		System.out.println(name + "의 개당 가격은 : " + money);
		System.out.println(name + "의 총가격은 : " + total);
	}
	
	@Override
	public void inputin() {
		inputdata();
		showdata();
	}
	
}
