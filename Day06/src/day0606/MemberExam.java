package day0606;

public class MemberExam {
	public static void main(String[] args) {
	
	Member memberService = new Member();
	
	boolean result = memberService.login("wogur","12345");
	
	if(result) {
		System.out.println("로그인 되었습니다.");
		memberService.logout("wogur");
	} else {
		System.out.println("id 또는 패스워드가 올바르지 않습니다.");
	}
}
}

