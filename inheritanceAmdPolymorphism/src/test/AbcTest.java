package test;


public class AbcTest {

	public static void main(String[] args) {
		Abc aa = new Abc();
		
//		System.out.println(aa.name);
//		System.out.println(aa.ssn);

		System.out.println(aa.getAge());
		aa.setAge(85);
		System.out.println("수정나이:"+aa.getAge());
	}

}
