package pack;

public class MyProcess {
	private String name;
	private Gugudan gugudan;
	private int dan;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGugudan(Gugudan gugudan) {
		this.gugudan = gugudan;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	@Override
	public String toString() {
		int[] re = gugudan.guguCalc(dan);
		String str = "";
		for (int i = 0; i < re.length; i++) {
			str += dan + " * " + (i + 1) + " = " + re[i] + "\n";
		}
		
		return "작성자:" + name + "\n" + dan + "단 결과" + str;
	}
}
