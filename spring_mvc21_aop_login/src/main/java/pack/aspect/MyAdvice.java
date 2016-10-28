package pack.aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {		//AOP를 실질적으로 처리하는 클래스 그러나 Login을 실질적으로 하는 곳은 Login Class이다
	@Autowired
	private LoginClass loginClass;
	
	@Around("execution(* getList*(..))")
	public Object loginProcess(ProceedingJoinPoint joinPoint) throws Throwable{
		HttpServletResponse response = null;
		HttpServletRequest request = null;
		
		for(Object o:joinPoint.getArgs()){ 	//request 인지 response인지 type을 걸러주는 역활
			if(o instanceof HttpServletResponse){
				response = (HttpServletResponse) o;			
			}
			if(o instanceof HttpServletRequest){
				request = (HttpServletRequest) o;		
			}		
		}
		
		//Session check 후 로그인 하지 않은 결우 로그인 창으로 이동
		if(!loginClass.loginCheck(request, response)){	//Name값이 없으면 null -> 비지니스 로직으로 들어가지 않는다
			return null;
		}
		
		Object object = joinPoint.proceed();
		return object;
	}
}
