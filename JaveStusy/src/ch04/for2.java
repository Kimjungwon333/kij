package ch04;

public class for2 {
	public static void main(String[] args) {
		// 구구단
		for(int x = 2; x <= 5; x++) {
			for(int y = 1; y <= 9; y++) {
				System.out.println(
						x+" * " + y + " = " +( x*y ));
			}
		}
		
		
		// 중첩 반복문
//		for (int a = 1; a <=3; a++) {
//			for(int b = 1; b <= 2; b++) {
//				// 1 1, 1 2, 2 1, 2 2, 3 1, 3 2
//				System.out.println(a+","+b);
//			}
//		}
	}

}
