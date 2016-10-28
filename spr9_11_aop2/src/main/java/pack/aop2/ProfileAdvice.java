package pack.aop2;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfileAdvice {
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
		//핵심 메소드 명 얻기
		String methodName = joinPoint.getSignature().toString();
		
		System.out.println(methodName + "시작 전 작업...");
		Object object = joinPoint.proceed();
		System.out.println(methodName + "처리 후 작업...");
		
		return object;
	}
}
