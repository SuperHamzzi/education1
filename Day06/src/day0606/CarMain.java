package day0606;

public class CarMain {

	public static void main(String[] args) {
		Car hun = new Car();
		Car momCar = new Car();
		//객체 사용
		hun.company = "현대";
		momCar.company = "기아";
		
		hun.model = "자전거";
		momCar.model = "킥보드";
		momCar.colors("파랑");
		System.out.println(hun.company);
		System.out.println(hun.speed);
		System.out.println(momCar.color);
		//static : 클래스명.필드명
		//		: 클래스명.메서드명()
		System.out.println(Car.maxSpeed);
	}

}
