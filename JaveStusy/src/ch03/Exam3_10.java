package ch03;
public class Exam3_10 {
public static void main(String[] args) {
	
		 char ch = 'T';
		 char lowerCase = (ch > 'A'&& ch <'Z' ) ? (char)( ch + 32  ) : ch;
		/*
		 char lower Case <�ҹ��ڷ� �ٲٴ� ��
		 
		 */
		 System.out.println("ch : " + ch);
		 System.out.println("ch to lowerCase : " + lowerCase);
}
	
}
