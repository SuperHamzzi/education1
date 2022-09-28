package polymorPhismExam;

class Vehicle{
	String name = "탈것";
	void kind() {
		System.out.println("vehicle은 탈것이다.");
		System.out.println(name); //인스턴스 필드는 인스턴스 메서드에서 사용할 수 있음
	}
	static void move() {
		System.out.println("vehicle이 이동한다.");// 인스턴스 필드는 정적메서드에서 호출X
	}
}
class Car extends Vehicle{
	String name = "자동차";
	
	void kind() {
		System.out.println("Car는 자동차이다.");
	}
	static void move() {
		System.out.println("Car가 달린다.");
	}
}
class SportCar extends Car{
	void kind() {
		System.out.println("SportCar는 스포츠 자동차이다.");
	}
}



public class PolymophismExams {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Vehicle veh = new Car();
		Car car = new SportCar();
		Car vehsp = new SportCar();
		System.out.println(vehsp.name);

	}

}
