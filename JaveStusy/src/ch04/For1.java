package ch04;

public class For1 {
	public static void main(String[] args) {
		
		int total = 0;
		int realTotal = 0;
			// 1.시작값 2. 끝값 3.증강값
		for(int start = 1; start <= 10; start++) {
			total = total + start;
			realTotal = realTotal +total;
			System.out.println("출력" + start);
			System.out.println(total);
			System.out.println(realTotal);
		}
//		//for(int end =10; end >=1; end--) {
//			System.out.println("감소출력" + end);
//		}
//		//1 2 3 조건이 제대로 맞지 않는 경우
//		
//		/*for(int idx = 1; idx <= 10;) {
//			System.out.println(idx);
//		}*/
		
	}
}
