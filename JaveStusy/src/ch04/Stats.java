package ch04;

public class Stats {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			/*int space = 5 - i;*/
			int space = i - 1;		
			for(int j = 1; j <=5; j++) {
				if(j <= space) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

		
	}
	
}
	
	
		/*	for(int a = 5; a >= 1; a--) {
			for(int b = 1; b <= a; b++) {
				System.out.print("¤±");
			}
			System.out.println();//ÁÙ¹Ù²Þ
			
			
			
			
				int i = 0;
				int space = 5 - i;
				if( a > space) {
				}
				System.out.println("d");
			}

	
		
		}*/
		
		



