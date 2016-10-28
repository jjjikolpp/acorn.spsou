package pack.model;

import org.springframework.stereotype.Repository;

@Repository
public class MyModel implements MyModelInter{
	public String processMsg() {
		System.out.println("processMsg 핵심 메소드 수행");
		return "Spring AOP 멋져";
	}
	
	public String businessMsg() {
		System.out.println("businessMsg 핵심 메소드 수행");
		return "Spring AOP 너무 멋져!";
	}
}
