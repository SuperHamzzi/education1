package day06Exam;
//설계도, 틀, 구조를 작업
public class Student {
	//필드 - 생략가능, 필드=멤버변수
	String name; //이름, 인스턴스 필드
	int studentNum;
	int age;
	
	//생성자 - 생략가능,생략시 컴파일러가 컴파일시에 기본생성자를 넣어준다.
	//		생성자가 없으면 객체(인스턴스)를 만들 수 없다.
	public Student() { //기본 생성자
		}
	
	//메서드 - 생략가능
	public void showInfo() {
		System.out.println(name +"의 나이는" + age +"살");
	}
	//접근제한자 리턴타입 메서드명()실행할 내용	}
}

//객체 만들기 : 클래스 만들기(설계도, 틀 , 구조) -> 객체생성 -> 객체 사용 