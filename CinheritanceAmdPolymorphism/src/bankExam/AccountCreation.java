package bankExam;

public class AccountCreation {
	private String accountNumber ="123-111";
	private String name ="홍길동";
	private int initialDepositAmount=3000;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInitialDepositAmount() {
		return initialDepositAmount;
	}
	public void setInitialDepositAmount(int initialDepositAmount) {
		this.initialDepositAmount = initialDepositAmount;
	}
	@Override
	public String toString() {
		return "-------"+"계좌생성"+"-------"+"\n계좌번호:" + accountNumber + "\n예금주:" + name + "\n초기입금액:"
				+ initialDepositAmount;
	}
	
		
	}


