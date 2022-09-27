package day0606;

import java.util.Scanner;

class Method {
	boolean order(int a) {
		if (a<=50 && a>=1)
			return true;
		else
			return false;
	}
}
public class OderExam2{
	public static void main(String[] args) {
		int orderNum = 0;
		
		Method mo = new Method();
		Scanner scan = new Scanner(System.in);
		System.out.println("주문 번호를 입력해 주세요");
		orderNum = Integer.parseInt(scan.next());
		if(mo.order(orderNum))
			System.out.println("주문이 완료");
		else
			System.out.println("주문 번호 오류");
	}


}
