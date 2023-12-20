package javaApp1.ch12.sec04;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택번호: ");
		
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		int[] WinningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호: ");
		for(int i=0; i<6; i++) {
			WinningNumber[i] = random.nextInt(45)+1;
			System.out.print(WinningNumber[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(WinningNumber);
		boolean result = Arrays.equals(selectNumber, WinningNumber);
		System.out.print("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첩되지 않았습니다.");
		}

	}

}
