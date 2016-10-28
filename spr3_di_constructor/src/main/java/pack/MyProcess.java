package pack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyProcess {
	private MoneyCalc moneyCalc;
	private int re[];
	public MyProcess(MoneyCalc moneyCalc) {
		this.moneyCalc = moneyCalc;
	}
	
	public void inputMoney(){
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader brader = new BufferedReader(reader);
			int mymoney = 0;
			System.out.print("금액을 입력");
			String data = brader.readLine();
			mymoney = Integer.parseInt(data);
			re = moneyCalc.calcMoney(mymoney);
		} catch (Exception e) {
			System.out.println("inputMoney 에러 : " + e);
		}
	}
	
	public void showResult(){
		StringBuffer sb = new StringBuffer();
		sb.append("만원 : " + re [0] + "\n");
		sb.append("천원 : " + re [1] + "\n");
		sb.append("백원 : " + re [2] + "\n");
		sb.append("십원 : " + re [3] + "\n");
		sb.append("일원 : " + re [4] + "\n");
		System.out.println(sb.toString());
	}
}
