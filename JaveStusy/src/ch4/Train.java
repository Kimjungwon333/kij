package ch4;

import java.util.Scanner;

public class Train {
	public static void main(String[] args) {
		System.out.println("����:0, ����:0,��:0");
		Scanner s = new Scanner(System.in);
		
		int player = s.nextInt();// ���� ������ ����
		int com =(int)(Math.random() * 3);//�� ��ǻ�Ͱ� ����
		
		
		
		if((player + 1) % 3 == com) {
			System.out.println("������");
	    }else {
	    	if (player == com) {
	    	System.out.println("���");
	    	} else {
	    		System.out.println("�������");
	    	}
		}
	}
}

