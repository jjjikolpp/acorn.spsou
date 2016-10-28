package pack.aop1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {
	private MyAspect myAspect;
	
	public void setMyAspect(MyAspect myAspect) {
		this.myAspect = myAspect;
	}
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable{
		Object object = null;
		myAspect.myLogon();
		object = joinPoint.proceed(); // 핵심 메소드
		myAspect.myLogout();

		return object;
	}
	
	public Object logging2(ProceedingJoinPoint joinPoint) throws Throwable{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object object = null;
		myAspect.myLogon();
		myAspect.mySecurity();
		try {
			object = joinPoint.proceed(); // 핵심 메소드
			
		} catch (Exception e) {
			System.out.println("핵심 메소드 호출 에러 : " + e);
		}
		myAspect.myLogout();

		stopWatch.stop();
		System.out.println("logging2 처리 시간 : "  + stopWatch.getTotalTimeMillis());
		return object;
	}
	
}
