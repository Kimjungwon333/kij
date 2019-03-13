package ch03;



public class Operation3 {
	public static void main(String[] args) {
		int num = 2324;
		// 첫번째 4 숫자 뜯어내기 
		int n1 = num % 10; // 4
		
		//두번째 2 숫자 뜯어내기
		num = num / 10; // 232
		int n2 = num % 10; // 2
		
		//두번째 3 숫자 뜯어내기
		num = num / 10; // 23
		int n3 = num % 10; // 3
				
		//두번째 2 숫자 뜯어내기
		num = num / 10; // 2
		int n4 = num % 10; // 2
		
		System.out.println(n1+n2+n3+n4);
		
	}
}

