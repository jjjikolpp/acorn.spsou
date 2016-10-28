package spr4_di_setter;

public class ShowData implements ShowInter{
	@Override
	public void showName(String name) {
		System.out.println("이름은  : " + name);
	}
	
	@Override
	public void showMessage(String hobby) {
		System.out.println("메시지는  : " + hobby);
		
	}
}
