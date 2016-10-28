package pack.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack.buser.business.BuserProcess;
import pack.buser.business.BuserViewInter;
import pack.sawon.business.ProcessInter;
import pack.sawon.business.SawonImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sawonano.xml");//sawoninit.xml //sawonano.xml
		
		ProcessInter inter = (SawonImpl)context.getBean("sawonImpl");
		BuserViewInter binter = (BuserProcess)context.getBean("buserProcess");
		inter.viewSawonAll();
		System.out.println();
		binter.viewBuserList();
		
	}
}
