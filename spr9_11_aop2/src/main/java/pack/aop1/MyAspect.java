package pack.aop1;

public class MyAspect {
	public void myLogon(){
		System.out.println("핵심 메소드 수행 전 로그온 작업");
	}
	
	public void myLogout(){
		System.out.println("핵심 메소드 수행 후 로그아웃 작업");
	}
	
	public void mySecurity(){
		System.out.println("핵심 메소드 수행 전 보안 설정");
	}
}
