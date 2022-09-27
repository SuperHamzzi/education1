package day0606;

public class CalculatorExam {
	
public static void main(String[] args) {
	

	// 클래스만들기(설계도, 틀) -> 객체생성 -> 객체 사용
			Calculator cal1 = new Calculator();
			Calculator cal2 = new Calculator();
			Calculator cal3 = new Calculator();
			
			System.out.println(cal1.add(10, 20));
			cal1.powerOn();
			int result = cal1.division(10,3);
			cal2.powerOff();
			
			System.out.println(cal2.avg(5, 7));
			
			System.out.println(cal3.multiplication(5, 2, 6));

}
}
