package javaBasic.ch04.sec01;

import java.util.Scanner;

public class Switch문 {

	public static void main(String[] args) {
		// 'A'라고 입력하면 Apple 이라고 출력
		// 'B'라고 입력하면 Bear 이라고 출력
		// 'C'라고 입력하면 Cat 이라고 출력하기
		
		//키보드 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 첫글자 입력하기(A~C)");
		String word = sc.next();
		
		/* 원래의 방법
		 * System.out.println(word);
		if (word.equals("A") ) System.out.println("Apple");
		else if (word.equals("B")) System.out.println("Bear");
		else if (word.equals("C")) System.out.println("Cat");
		else {
			System.out.println("입력하신 글자는 A,B,C가 아닙니다.");
		}*/
		
		//switch
		switch( word ) {
		case "A" : System.out.println("Apple"); break;
		case "B" : System.out.println("Bear"); break;
		case "C" : System.out.println("Cat"); break;
		default : System.out.println("입력하신 글자는 A, B, C가 아닙니다."); break;
		
		}
		//break문은 입력된 곳의 {} 박으로 나가라는 뜻
		//number = 100이면 "백의자리" 10이면 "십의자리" 1이면 "일의자리"
		int num = 10;
		switch( num ) {
		case 100 : System.out.println("백의자리"); break;
		case 10 : System.out.println("십의자리"); break;
		case 1 : System.out.println("일의자리"); break;
		}
		
		//if문으로 작성하기
		int number = 10;
		if (number ==100) System.out.println("백의자리");
		else if (number == 10) System.out.println("십의자리");
		else if (number == 1) System.out.println("일의자리");
	}
	
	

}
