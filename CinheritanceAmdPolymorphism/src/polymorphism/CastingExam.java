package polymorphism;

public class CastingExam {

	public static void main(String[] args) {
		CastA ca = new CastA();
		System.out.println(ca.m);
		ca.showA();
		System.out.println();
		
		CastB cb = new CastB();
		cb.showA();
		System.out.println(cb.m);
		System.out.println();
		
		//upcasting
		CastA cc = new CastB();
		System.out.println(cc.m);
		cc.showA();
		
		CastA ca1 = new CastA();
		CastB cb2 = new CastB();
		System.out.println("ca1은 CastB로");
		
	}
	

}