package jdbc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Timestamp;

public class Member {
	private String id;
	private String name;
	private String pass1;
	private String pass2;//확인용

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public Member() throws IOException {
		System.out.println("사용자 아이디:");
		id=br.readLine();
		System.out.println("사용자 이름:");
		name=br.readLine();
		System.out.println("비밀번호:");
		pass1=br.readLine();
		System.out.println("비밀번호 확인:");
		pass2=br.readLine();
		
	
	}
}
