package anno1_required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import anno2_auto.SenderProcess;

public class Main2 {
	
	public static void main(String[] args) {
		String[] metas = new String[]{"anno2.xml"};
		
//		ApplicationContext context = new ClassPathXmlApplicationContext(metas[0]);
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(metas[0]);
		
		SenderProcess process = context.getBean("senderProcess", SenderProcess.class);
		process.dispData();
		process.getSender().show();
	}
}
