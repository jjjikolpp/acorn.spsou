package spr5_di_setter_ex;

public class Process {
	String sang,su,dan;
	private Sanpum sangpum;

	public void setSang(String sang) {
		this.sang = sang;
	}

	public void setSu(String su) {
		this.su = su;
	}

	public void setDan(String dan) {
		this.dan = dan;
	}
	
	public String toString(){
		String[] rs = sangpum.Sangin();
		
		String str = "";
		for (int i = 0; i < rs.length; i++) {
			str += rs[0] + "의 총 가격은" + Integer.parseInt(rs[1]) * Integer.parseInt(rs[2]);
		}
		
		return str;
	}
	
}
