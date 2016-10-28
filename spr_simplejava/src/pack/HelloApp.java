package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		//순수  자바를 이용한 방법
		Message1 message1 = new Message1();
		message1.sayHello("홍길동");
		
		Message2 message2 = new Message2();
		message2.sayHello("신기해");
		
		System.out.println();
		MessageInter inter = null;
		inter = message1;
		inter.sayHello("한국인");
		inter = message2;
		inter.sayHello("신기루");
		
		//spring lib를 사용
		System.out.println();
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter2 = (MessageInter)context.getBean("mb1");
		inter2.sayHello("김치국");
		inter2 = (MessageInter)context.getBean("mb2");;
		inter2.sayHello("공기밥");
	}
}
