package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RunAdvice {
	@Around("execution(public void startProcess())")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AOP 시작 : 핵심 메소드 수행전에 id 검사" );
		
		System.out.print("input id:");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		sc.close();
		if(!id.equals("aa")){
			System.out.println("id불일치. 작업을 종료합니다");
			return null;
		}
		
		Object object = joinPoint.proceed();
		
		System.out.println("AOP 종료");
		return object;
		
	}
}
