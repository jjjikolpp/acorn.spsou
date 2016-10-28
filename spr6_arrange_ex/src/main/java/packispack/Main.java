package packispack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MessageInterImpl impl = (MessageInterImpl) context.getBean("my");
		
		impl.sayHi();
	}
}
