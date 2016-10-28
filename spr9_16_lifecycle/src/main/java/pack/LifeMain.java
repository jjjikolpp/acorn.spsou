package pack;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LifeMain {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("life_init.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		factory.addBeanPostProcessor(new CustomerBean());
		
		Message message = (Message)factory.getBean("impl");
		message.sayHello();
		
	}
}
