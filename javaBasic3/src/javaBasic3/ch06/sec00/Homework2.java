package javaBasic3.ch06.sec00;

import java.util.Scanner;

public class Homework2 {
	//�ڹ� 2�� 71p

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x �� �Է�: ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y �� �Է�: ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y : " + result);
		System.out.println();
		
		while(true) {
			System.out.print("�Է� ���ڿ�: ");
			String data = sc.nextLine();
			if (data.equals("q"))
				break;
			System.out.println("��� ���ڿ�: " + data);
			System.out.println();
		}
		
		System.out.println("����");

	}

}
