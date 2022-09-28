package classExam;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add("안녕하세요");
		aList.remove(0);
		aList.add("치킨먹고싶다.");
		aList.size();
		aList.add("냠");
		aList.add("냠냠");
		aList.add("냠냠냠");
		
		for(String a : aList) {
			System.out.println(a);
		
			
		}
	}

}
