package ch03;
import java.util.Scanner;
public class Exam3_7 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
	 int n = scanner.nextInt();
	 int ten = n / 10; // 10�� �ڸ� ���� ������ ����
	 int one = n % 10; // 1�� �ڸ� ���� ������ ����
	 boolean isMatch = false; // �� �ڸ� �� �� ���� ������ ����
	 /* ten ������ 10�� �ڸ� �� ���� */
	 /* one ������ 1�� �ڸ� �� ���� */
	 /* isMatch ������ �� ���� �ڸ� �� �� �� ���� */

	 isMatch = ten == one;
	 
	 System.out.println(isMatch);
	 scanner.close();
}
}
