package newrunner;

import java.util.Scanner;

public class BankApplications {
	private static Account[] accountArr = new Account[100];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
		System.out.println("-----------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("-----------------------------------------------------");
		System.out.println("선택>");
		int select = sc.nextInt();
		
		
			if(select==1) {createAccount();
			}
			else if(select==2) { accountList();
			}
			else if(select==3)  {deposit();	
			}
			else if(select==4) {withdraw();
			}
			
		else if(select==5)  {run = false;
		}
		}
		
		System.out.println("시스템이 종료");
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static  void accountList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");
		for(int i=0; i<accountArr.length; i++){
			Account account = accountArr[i];
			if(account != null) {
				System.out.println(account.toString());
			}
		}
		
	}

	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		System.out.print("계좌번호:");
		String ano = sc.next();
		System.out.print("예금액:");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account ==null) {
			System.out.println("계좌가 없습니다.");
				return;
			}
		account.setDeposit(account.getDeposit()-money);
		System.out.println("출금이 성공되었습니다.");
		
	}

	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		System.out.print("계좌번호:");
		String ano = sc.next();
		System.out.print("예금액:");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account ==null) {
			System.out.println("계좌가 없습니다.");
				return;
			}
		account.setDeposit(account.getDeposit()+money);
		System.out.println("예금이 성공되었습니다.");
		}
	

	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i] != null) {
				String dbAno = accountArr[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArr[i];
					break;
				}
			}
			
		}
		return account;
	}

	private static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		System.out.print("계좌번호:");
		String ano = sc.next();
		System.out.print("계좌주:");
		String owner = sc.next();
		System.out.print("초기입금액:");
		int deposit = sc.nextInt();
		
		Account account = new Account(ano,owner,deposit);
			for(int i=0; i<accountArr.length;i++) {
				if(account != accountArr[i]) {
					accountArr[i]= account;
					System.out.println("계좌가 생성되었습니다.");
					break;
				}
			}
		
		}
	








	



}


