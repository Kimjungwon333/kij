package ch04;

public class Exam4_5 {
	public static void main(String[] args) {

		 int count = 0;
		 
		 boolean isContinue= true;
		 while(isContinue) {
		 int num1 = (int) (Math.random() * 6 + 1);
		 int num2 = (int) (Math.random() * 6 + 1);
		 count++;
		 System.out.println("(" +num1+ "," + num2 + ")");
		 
		 if((num1+num2)>=10){
			 System.out.println("");
			 isContinue = false;
		 }
		 
		 

		 // �ڵ� �ۼ�
		 }
		 System.out.println("�ֻ����� ���� Ƚ�� : " + count);
		 
		 /*
		  * �ΰ��� �ֻ����� �������� ������ ���� (��1, ��2) ���·� ����ϰ�,
			���� ���� 10�̸� ������ �����ϴ� �ڵ� �ۼ� (Math.random() �޼ҵ�)
		  */
	}

}
