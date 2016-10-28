package pack;

public class MessageImpl implements MessageInter {
	//핵심 로직 클래스 - target
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		System.out.println("안녕 ?" + name + "님! 비즈니스 로직 처리 중");
		//시간 끌기
		int t = 0;
		while (t < 5){
			try {
				Thread.sleep(1000);
				System.out.println(".");
				t++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println();
		System.out.println("sayHello 처리 완료");
		System.out.println("----------------------");
	}
}
