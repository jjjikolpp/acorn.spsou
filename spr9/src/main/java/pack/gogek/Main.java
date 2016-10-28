package pack.gogek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bankinit.xml");
		
		Gogek daniel = (Gogek)context.getBean("gogek");
		daniel.selBank("sinhan");
		daniel.playInputMoney(500);
		daniel.playOuputMoney(200);
		System.out.print("daniel - ");
		daniel.showMoney();
		
		System.out.println();
		Gogek john = (Gogek)context.getBean("gogek");
		john.selBank("sinhan");
		john.playInputMoney(500);
		john.playOuputMoney(200);
		System.out.print("john - ");
		john.showMoney();
		
		System.out.println(daniel.toString() + " " + john);
		System.out.println();
		
		Gogek oscar = (Gogek)context.getBean("gogek");
		oscar.selBank("hana");
		oscar.playInputMoney(500);
		oscar.playOuputMoney(100);
		System.out.print("oscar - ");
		oscar.showMoney();
	}
}
