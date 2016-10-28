package anno3_resource;

import javax.annotation.Resource;

public class AbcProcess {
	@Resource(name="abc1") //객체 이름에 의한 맵핑
	private Abc1 abc1;
	
	private Abc2 abc2;
	
	@Resource(name="abc2")
	public void setAbc2(Abc2 abc2){
		this.abc2 = abc2;
	}
	
	public void showData(){
		String ss = "결과 : 이름은 " + abc1.getIrum();
		ss += ", 나이는 " + abc2.getNai();
		System.out.println(ss);
	}
}
