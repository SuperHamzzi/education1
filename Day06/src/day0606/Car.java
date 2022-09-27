package day0606;

public class Car {
	// 필드 - 인스턴스 필드, 멤버 변수, 특성, 속성
	String company;
	String model;
	String color = "노랑";
	int speed = 250;
	static int maxSpeed = 450;
	
	//기본 생성자
	public Car() {} //기본 생성자
	
	// 메서드 - 동작, 작동 방식 , 정보,...
	public void carInfo() { //인스턴스 메서드
		System.out.println(model+ ","+color);
		}
	public String colors(String color) {
		this.color = color;
		
		return color;
	}
}
