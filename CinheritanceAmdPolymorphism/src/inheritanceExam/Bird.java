package inheritanceExam;

public class Bird extends Animal{

	String wings;
	
	public Bird() {
		
	}

	public void fly(){
		System.out.println("새가 날아간다");
	}
	@Override
	public void cry() {
		System.out.println("새는 짹쨱 운다.");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("모이를 냠냠");
	}
}

