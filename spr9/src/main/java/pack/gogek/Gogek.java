package pack.gogek;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pack.bank.Bank;
import pack.bank.HanaBank;
import pack.bank.SinhanBank;

@Service
@ComponentScan("pack.bank")
@Scope("prototype")
public class Gogek {
	private Bank bank;
	
	@Autowired(required=true) //type에 의한 매핑
	private SinhanBank sinhanBank;
	
	@Resource(name="hana") //객체 변수 이름에 의한 매핑
	private HanaBank hanaBank;
	
	public void selBank(String sel){
		if(sel.equalsIgnoreCase("sinhan")){
			bank = sinhanBank;
		}if(sel.equalsIgnoreCase("hana")){
			bank = hanaBank;
		}
	}
	
	public void playInputMoney(int money){
		bank.inputMoney(money);
	}
	
	public void playOuputMoney(int money){
		bank.outputMoney(money);
	}
	
	private String msg;
	@PostConstruct
	public void init(){
		msg = "계좌 잔고 : ";
	}
	
	public void showMoney(){
		//System.out.println("계좌 잔고 : "  + bank.getMoney());
		System.out.println( msg  + bank.getMoney());
	}
}
