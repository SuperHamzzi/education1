package runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Runner {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		for(int i =0; i<a; i++) {
			String[] str = br.readLine().split(" ");
			
			int R = Integer.parseInt(str[0]);
			String S = str[1];
		for(int j = 0; j< S.length(); j++) {
			for(int k = 0; k<R; k++) {
				System.out.print(S.charAt(j));
			}
		
		}
		System.out.println();
		}
	}

}
