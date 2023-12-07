package javaBasic.ch03.sec02;

import java.util.Scanner;

public class 산술연산자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 키보드로 글자 입력하는 클래스(class)
		
		//이름은?
		//국어 점수는?
		//영어 점수는?
		//수학 점수는?
		//출력
		//홍길동 100 80 90
		
		System.out.println("이름은?");
		String name = sc.next();
		System.out.println();
		
		System.out.println("국어 점수는?");
		int kor = sc.nextInt();
		System.out.println();
		
		System.out.println("영어 점수는?");
		int eng = sc.nextInt();
		System.out.println();
		
		System.out.println("수학 점수는?");
		int mat = sc.nextInt();
		System.out.println();
		
		System.out.println(name + "의 점수는" + " 국어" + kor + "점 영어" + eng + "점 수학" + mat + "점이다.");
		
		//점수의 합계 구하기
		int sum = kor + eng + mat ;
		//국어합계차 = 합계 - 국어점수
		int sum1 = sum - kor;
		//평균
		double avg = sum / 3.0;
		//수학점수가 홀수입니까? 짝수입니까?
		//% = 나머지
		int matMod = mat % 2;
		
		System.out.println(sum + " " + sum1 + " " + avg + " " + matMod);

		
//		int kor = sc.nextInt();
//		System.out.println(kor);
//		
//		double rate = sc.nextDouble();
//		System.out.println(rate);
//		
//		boolean OX = sc.nextBoolean();
//		System.out.println(OX);
//		
//		//홍길동 이름 입력
//		String name = sc.next();
//		System.out.println(name);

	}

}
