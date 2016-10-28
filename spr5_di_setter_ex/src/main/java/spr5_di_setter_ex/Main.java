package spr5_di_setter_ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("cc");
		ApplicationContext context =
				new ClassPathXmlApplicationContext("app_init.xml");
		System.out.println("aa");
		
		Process pro = (Process)context.getBean("process");
		System.out.println(pro);
		System.out.println("bb");
	}

}
