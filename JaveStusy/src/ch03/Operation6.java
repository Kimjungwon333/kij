package ch03;


import java.util.Scanner;
public class Operation6 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result = false;
		result = num1++ < 0 && num2++ > 0;//앞에가 참이되야 뒤에잇는게 의미가잇다 (앞이 거짓이면 뒤는 실행 x)
		System.out.println(num1); // 1
		System.out.println(num2); // 0<< 위의 공식이 앞이 거짓이므로 뒤는 실행되지안아 0출력 
		
	}
}

