package inheritanceExam;

public class StudentRunner {
	public static void main(String[] args) {
		Student hong = new Student();
		Student kim = new Student();
		
		hong.showInfo();
		hong.setSsn("220301");
		System.out.println(hong.getSsn());
		
		System.out.println();
		kim.showInfo();
		System.out.println();
	
		Student lee = new Student("124", "이자바", 20,"소프트");
		lee.showInfo();
	}

}