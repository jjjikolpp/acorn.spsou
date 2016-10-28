package pack;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("arrange.xml");
		
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("classpath:pack/arrange.xml"); // 클래스 패트 루트에 있을때는 안써도 괜찮지만  다른 경로에 있을때는 클래스패스 정확하게 걸어라
		
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext("arrange.xml"); // 이걸 추천 위에꺼는 2점대부터 이거는 3점대부터  여러가지를 섞어놈
		
		
		MessageImpl impl1 = (MessageImpl) context.getBean("mbean");
		MessageImpl impl2 = (MessageImpl) context.getBean("mbean");
		
		System.out.println(impl1 + " " + impl2); // arrange.xml .. 에서 기본적으로 싱글톤이지만 스코프에서 prototype 적어주면 싱글톤이 아닐수 있음
		impl1.sayHi();
		
		System.out.println();
		//다형성
//		MessageInter inter = (MessageImpl)context.getBean("mbean");
//		MessageInter inter = (MessageInter)context.getBean("mbean");
		MessageInter inter = context.getBean("mbean" , MessageInter.class);
		
		inter.sayHi();		
		
		context.close();
	}
}
