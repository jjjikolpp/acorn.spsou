package pack.aop1;

public class HelloInterImpl implements HelloInter{
	public HelloInterImpl() {
		System.out.println("HelloInterImpl 생성");
	}
	
	@Override
	public void hello() {
		try {
			System.out.println("hello수행");
			Thread.sleep(3000);
			System.out.println("3초 지남");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void hi() {
		System.out.println("hi() 수행");
		
	}
}
