package javaApp1.ch12.sec04;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("���ù�ȣ: ");
		
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		int[] WinningNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷��ȣ: ");
		for(int i=0; i<6; i++) {
			WinningNumber[i] = random.nextInt(45)+1;
			System.out.print(WinningNumber[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(WinningNumber);
		boolean result = Arrays.equals(selectNumber, WinningNumber);
		System.out.print("��÷ ����: ");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		}else {
			System.out.println("��ø���� �ʾҽ��ϴ�.");
		}

	}

}
