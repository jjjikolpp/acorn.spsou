package pack.aop3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProfileAdvice {
	@Around("execution(public * pack.aop3..*(..))")
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
		//핵심 메소드 명 얻기
		String methodName = joinPoint.getSignature().toString();
		
		System.out.println(methodName + "시작 전 작업...");
		Object object = joinPoint.proceed();
		System.out.println(methodName + "처리 후 작업...");
		
		return object;
	}
	
	@Before("execution(public * pack.aop3..*(..))")
	public void mbc()throws Throwable{
		System.out.println("핵심 메소드 실행 전.......");
	}
	
	@After("execution(public * pack.aop3..*(..))")
	public void sbc()throws Throwable{
		System.out.println("핵심 메소드 실행 후.......");
	}
}
