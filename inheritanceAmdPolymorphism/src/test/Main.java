package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int b=0; int sum=N;
		while(true) {
			b = N%10;
			sum +=b;
			N = N/10;
			if(N!=0)break;
			}
		System.out.println(sum);
		
		
		
		
	
	}
	}


