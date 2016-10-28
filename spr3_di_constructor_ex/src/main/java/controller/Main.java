package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.DataDao;
import model.DataDaoImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("app_init.xml");
		
		CalcService calcService = (CalcService)context.getBean("calcServiceImpl");
		calcService.calserviceinput();
		calcService.view();
	
	}

}
