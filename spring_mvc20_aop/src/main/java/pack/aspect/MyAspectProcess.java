package pack.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectProcess {
	
	@Autowired
	private SecurityClass class1;
	
	@Around("execution(public String processMsg()) or execution(* bu*(..))*")
	public Object aopProcess(ProceedingJoinPoint joinPoint) throws Throwable{
		class1.mySecurity();
		
		Object object = joinPoint.proceed();
		
		return object;
	}
	
}
