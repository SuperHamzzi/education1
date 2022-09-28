package newrunner;

public class Account {
	private String ano;
	private String owner;
	private int deposit;
	public Account(){
	}
	public Account(String ano, String owner, int deposit) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.deposit = deposit;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	@Override
	public String toString() {
		return "계좌번호:" + ano + "계좌목록:" + owner + "잔액:" + deposit;
	}
}
