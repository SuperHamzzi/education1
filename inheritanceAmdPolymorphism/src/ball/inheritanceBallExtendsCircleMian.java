package ball;


class Circle {
	// 필드
	final static double PI = 3.1415;  //상수
	double r = 10.0;

	// 생성자
	public Circle() {}
	
	// 메소드
	void findRadius() {
		System.out.println("반지름은 10.0센티미터");
	}

	void findArea() {
		System.out.println("넓이는 PI * 반지름 * 반지름 으로 구함");
	}

}
class Ball extends Circle {
	// 필드
	private String color;
	double vol;

	// 생성자
	public Ball(String color) {
		// supuer();
		this.color = color;
	}

	// 메소드
	public void findColor() {
		System.out.println(color + "공이다.");
	}

	public void volume() {
		vol = 4 / 3 * (PI * r * r * r);
		System.out.println("구의 부피는 " + vol + "이다.");
	}

	@Override
	public void findArea() {
		super.findArea();

		double width = 4 * PI * r * r;
		System.out.println("구의 넓이는 " + width + "이다");
	}
}

public class inheritanceBallExtendsCircleMian {

		public static void main(String[] args) {
			// 객체 생성
			Circle c = new Circle();

			Ball b = new Ball("노랑색");

			// 부모 원을 멤버를 처리
			System.out.println("여긴 원의 내용 입니다.");
			c.findRadius();
			c.findArea();

			System.out.println();
			System.out.println("===================");
			System.out.println();

			System.out.println("자식인 Ball의 내용입니다.");
			b.findArea(); // 자식거, 오버라이딩 되었으니
			b.findColor();
			b.volume();
			b.findRadius(); // 부모것

		}
	}


