package ch03;
import java.util.Scanner;
public class Exam3_8 {
public static void main(String[] args) {
		int num = 12345;
		// 코드 작성 (% 연산자)
		int num1 = num % 10 ;
		
		int num2 = num % 10 ;
		
		int num3 = num % 10 ;
		
		int num4 = num % 10 ;
		
		int num5 = num % 10 ;
		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("각 자리 숫자의 합 : " + total);
}
}
