package spr4_di_setter;

public class ProcessInterImpl implements ProcessInter{
	private int age;
	private String name;
	private ShowInter showInter;
	
	@Override
	public void setShowInter(ShowInter showInter) {
		this.showInter = showInter;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	//@Override
	public void print(){
		showInter.showName(name);
		showInter.showMessage(" 나이 : " + age);
	}
}
