package anno1_required;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main1 {
	public static void main(String[] args) {
//		GenericXmlApplicationContext context = new GenericXmlApplicationContext("anno1.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno1.xml");
		Abc abc = context.getBean("abc", Abc.class);
//		System.out.println(abc);
		System.out.println(abc.toString());
		
		context.registerShutdownHook(); // 서블릿 destory()를 명시적으로 호출
		context.refresh();
		context.close();
		
	}
}
