package packageAndimprot;

import test.importTest;
import test.Abc;
public class importExam{

	public static void main(String[] args) {
	importTest test = new importTest();
	com.multi.test.ImportTest hi = new com.multi.test.ImportTest();
	test.show();
	hi.info();
	
	Abc at = new Abc();
	System.out.println(at.name);
	System.out.println(at.getAge());
	at.setAge(15);
	System.out.println(at.getAge());
	
	

	}

}
