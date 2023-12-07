package javaBasic.ch04.sec01;

import java.util.Scanner;

public class 복습문제 {

	public static void main(String[] args) {
		
		
		// [1206 복습문제]
		// 문자 하나와 온도를 실수형으로 입력받아
		// 문자가 f나 F이면 입력받은 값을 화씨로 간주하여 섭씨로,
		// 문자가 c나 C이면 입력받은 값을 섭씨로 간주하여 화씨로 바꿔 출력하는 프로그램 작성
		// F=(0.9/5.0)*C+32
		// C=(5.0/0.9)*(F-32)
	
		Scanner sc = new Scanner(System.in);
		System.out.println("--화씨를 섭씨로, 섭씨를 화씨로--");
		System.out.println("문자를 입력하세요.(C/F)");
		String word = sc.next();
		// sc.next = 입력한걸 word에 넣어주세요 (String이니까 문자)
		System.out.println("온도를 입력하세요.");
		int temp = sc.nextInt();
		double result = 0.0 ;
		
		if (word.equals("C")  || word.equals("c"))
			result = (9.0/5.0) * temp + 32;
		else if (word.equals("F") || word.equals("f"))
			result = (5.0/9.0) * (temp-32);
		else { 
			System.out.println("입력하신 온도는 섭씨 또는 화씨가 아닙니다.");
		}
		System.out.println("온도는: " + result);
		

	}
}
