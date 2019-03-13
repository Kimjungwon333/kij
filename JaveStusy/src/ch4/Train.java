package ch4;

import java.util.Scanner;

public class Train {
	public static void main(String[] args) {
		System.out.println("가위:0, 바위:0,보:0");
		Scanner s = new Scanner(System.in);
		
		int player = s.nextInt();// 바위 유저가 낸거
		int com =(int)(Math.random() * 3);//보 컴퓨터가 낸거
		
		
		
		if((player + 1) % 3 == com) {
			System.out.println("유저짐");
	    }else {
	    	if (player == com) {
	    	System.out.println("비김");
	    	} else {
	    		System.out.println("유저비김");
	    	}
		}
	}
}

