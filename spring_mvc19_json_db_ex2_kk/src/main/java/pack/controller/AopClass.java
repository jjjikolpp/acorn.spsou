package pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AopClass {

	@Around("execution(public String gogek(..))")
	public Object loginAop(ProceedingJoinPoint joinPoint) throws Throwable {
		Object obj = null;
		HttpServletRequest req = null;
		
		Object[] ob = joinPoint.getArgs();
		if (ob[0] instanceof HttpServletRequest) {
			req = (HttpServletRequest) ob[0];
		}

		HttpSession session = req.getSession();

		if (session.getAttribute("login") == null) {
			obj = "login";
		} else {
			obj = joinPoint.proceed();
		}
		return obj;
	}
}
