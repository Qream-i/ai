package javaBasic3.ch06.sec00;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		//4�� 133p
		Scanner sc = new Scanner (System.in);
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");

	}

}
