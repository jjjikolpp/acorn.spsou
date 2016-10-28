package bank.business;

import java.util.List;
import java.util.Scanner;

import bank.model.Account;

public class SinhanBank implements BankUiInter{
	private BankServiceInter bankServiceInter;
	
	public void setBankServiceInter(BankServiceInter bankServiceInter) {
		this.bankServiceInter = bankServiceInter;
	}
	
	@Override
	public void startWork() throws Exception {
		// 은행 업무 처리
		String menu = null;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("작업 메뉴 선택하시오");
			System.out.println("1) 계좌 등록");
			System.out.println("2) 계좌 몹록");
			System.out.println("3) 입금");
			System.out.println("4) 출금");
			System.out.println("5) 이체");
			System.out.println("q) 종료");
			System.out.println(">>");
			
			try {
				menu = sc.nextLine();
				//System.out.println(menu);
				if (menu.equals("1")) { // 계좌 등록
					System.out.print("계좌번호 입력:");
					String account_no = sc.nextLine();
					System.out.print("고객명 입력:");
					String name = sc.nextLine();
					
					Account account = new Account(account_no, name);
					bankServiceInter.addAccount(account);
				}else if (menu.equals("2")) { // 계좌 목록
					List<Account> accounts = bankServiceInter.getAccounts();
					
					for (int i = 0; i < accounts.size(); i++) {
						System.out.print(accounts.get(i).getAccount_no()+ "\t");
						System.out.println(accounts.get(i).getName());
					}
				}else if (menu.equals("3")) { // 입금 
					System.out.print("계좌 번호 입력:");
					String account_no = sc.nextLine();
					Account account = bankServiceInter.findAccount(account_no);
					if (account != null) {
						System.out.print("입금액을 입력:");
						int money = sc.nextInt();
						bankServiceInter.deposit(account, money);
						
					}else{
						System.out.println("등록 되지 않은 계좌번호 입니다");
					}
				}else if (menu.equals("4")) { // 출금
					System.out.print("계좌 번호 입력:");
					String account_no = sc.nextLine();
					Account account = bankServiceInter.findAccount(account_no);
					if (account != null) {
						System.out.print("출금액을 입력:");
						int money = sc.nextInt();
						bankServiceInter.withdraw(account, money);
						
					}else{
						System.out.println("등록 되지 않은 계좌번호 입니다");
					}
				}else if (menu.equals("5")) { // 이체
					System.out.println("from 계좌에서 to 계좌로 송금하기");
					System.out.print("from 계좌번호 입력:");
					String account_no = sc.nextLine();
					Account from = bankServiceInter.findAccount(account_no);
					
					System.out.print("to 계좌번호 입력:");
					account_no = sc.nextLine();
					Account to = bankServiceInter.findAccount(account_no);
					System.out.println();
					
					if (from !=null && to != null) {
						System.out.println("이체 급액 입력:");
						int send_money = sc.nextInt();
						bankServiceInter.transfer(from, to, send_money);
					}else{
						System.out.println("계좌 번호 오류로 인해 이체 처리 불가!!!");
					}
				}
				System.out.println();
				
			} catch (Exception e) {
				System.out.println("개인업무처리 오류 : " + e);
			}
		}while(!menu.equals("q"));
		sc.close();
		System.out.println("은행 업무 종료");
	}
}
