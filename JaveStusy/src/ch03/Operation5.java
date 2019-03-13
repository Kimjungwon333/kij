package ch03;

import java.util.Scanner;

public class Operation5 {
	public static void main(String[] args) {
		int score = 0;
		
		System.out.println("숫자 입력>3");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		char grade = score >=90 ? 'A' :(score >=80 ? 'B' : 'c' ) ;
		
		System.out.println(grade);

		scan.close();
		
		
		
	}
}

