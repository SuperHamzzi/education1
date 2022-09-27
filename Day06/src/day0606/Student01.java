package day0606;

class Student{
	String name;
	int studentNumber;
	int score;
	
	
	public Student(int studentNumber, String name, int score) {
		this.studentNumber =studentNumber;
		this.name =name;
		this.score =score;
	}
	
	 public String exam(int score) {
		 String result = "";
		 if(score>60) {
			 result ="합격";
		 }else {
			 result ="불합격";
		 }
	return result;
	 }
	 public void studentInfo() {
		 System.out.println("학번:" + studentNumber);
		 System.out.println("이름:" + name);
		 System.out.println("점수:" + score);
	 }
}	


public class Student01 {

	
	public static void main(String[] args) {
		Student std1 = new Student(220301,"홍길동",75);
		Student std2 = new Student(220302,"김자바",55);
		std1.studentInfo();
	}

}