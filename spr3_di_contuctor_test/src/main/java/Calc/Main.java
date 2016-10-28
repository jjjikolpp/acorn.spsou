package Calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import input.InputInter;
import input.Inputdata;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app_init.xml");
		InputInter inter = (InputInter)context.getBean("inputdata");
		inter.inputin();
	}
	
}
