package Calc;

public class CalcImpl implements Calc{
	@Override
	public int totalCalc(int money, int su) {
		int total = money * su;
		return total;
	}
	
}
