package ch03;

import java.util.Scanner;

public class Operation1 {
	//한줄삭제 : Ctrl + D
	//줄 복사 Ctrl + Alt + V  
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();//키보드로 숫자 입력받음
		boolean 배수 = num % 3 == 0;
		System.out.println(배수);
		s.close();
	}
	
}
