package polymorphism;

public class CastB extends CastA{
	int n = 4;
	void showB() {
		System.out.println("B클래스");
	}
	public void showA() {
		System.out.println("가져와버렸습니다.");

	}
}