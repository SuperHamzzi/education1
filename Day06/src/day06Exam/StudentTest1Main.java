package day06Exam;

public class StudentTest1Main {

	public static void main(String[] args) {
		
		//객체 생성
		StudentTest1 kim = new StudentTest1();
		StudentTest1 park = new StudentTest1();
		//객체 사용
		kim.name = "김재혁";
		kim.studentNumber = 17;
		kim.major = "컴공";
		kim.grade = "A";
		kim.score = 70;
		kim.showInfo();
		System.out.println(kim.name);
		
		park.name = "박자바";
		park.major = "소프트 공학";
		park.studentNumber = 15;
		park.showInfo();
	}

}
