package ch03;


import java.util.Scanner;
public class Operation6 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result = false;
		result = num1++ < 0 && num2++ > 0;//�տ��� ���̵Ǿ� �ڿ��մ°� �ǹ̰��մ� (���� �����̸� �ڴ� ���� x)
		System.out.println(num1); // 1
		System.out.println(num2); // 0<< ���� ������ ���� �����̹Ƿ� �ڴ� ��������Ⱦ� 0��� 
		
	}
}

