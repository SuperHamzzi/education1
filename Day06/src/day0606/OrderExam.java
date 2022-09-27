package day0606;



public class OrderExam {

public static void order(int ord) {
		if(1<=ord && ord<=50) {
			System.out.println(ord +"주문이 완료 되었습니다.");
			return;	
		}
	System.out.println("주문이 실패했습니다.");
				
	}
		
	
public static void main(String[] args) {
	order(2);
	order(3);
}
}
