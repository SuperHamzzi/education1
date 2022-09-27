package test;

public class Abc {

			
		
		
		public String name = "홍길동";
	int ssn = 123;
	private int age = 20;
	
public void showPrivate() {
	System.out.println(age);
}
public int getAge() {
	
	return age;
}
public void setAge(int age) {
	//유효성 검사
	if(age<0 || age>120) {
		System.out.println("잘못된 나이입니다.");
		}
	this.age = age; //필드에 매개값으로 넘겨받은 age를 담기
}









}
