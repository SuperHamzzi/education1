package day06Exam;

public class CarRunner {
	public static void main(String[] args) {
		Car hun = new Car();
		hun.manufacturer = "현대";
		hun.model = "킥보드";
		hun.color = "Red";
		hun.max_Speed = 250;
		hun.showInfo();
		System.out.println(hun.manufacturer);
	}
}