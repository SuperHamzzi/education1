package bankExam;

import java.util.Scanner;

public class BankRunner {

	public static void main(String[] args) {
		AccountCreation number1 = new AccountCreation();
		AccountCreation number2 = new AccountCreation();
		AccountCreation number3 = new AccountCreation();
		AccountCreation number4 = new AccountCreation();
		AccountCreation number5 = new AccountCreation();
		
		Scanner sc = new Scanner(System.in);
		int choose =0 ;
		System.out.println("==========================================================");
		System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("==========================================================");
		System.out.print("선택 >");
		choose = sc.nextInt();
		if(choose==1) {
			System.out.println(number1);
		}else if(choose==2) {
			
		}
	}

}


	












