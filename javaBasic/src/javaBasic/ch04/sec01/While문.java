package javaBasic.ch04.sec01;

public class While문 {

	public static void main(String[] args) {
		// 반복문
		// 형식 while(조건) { 참이면 수행할 문장 }
		//1~100 출력하기
		// System.out.println("1 2 3 4 ... 100");
		/*int number = 1;
		System.out.println(number);
		while( number <100 ) {
			number++;
			System.out.println(number);
		}*/
		// 10 20 30 40 .. 100
		int number = 10;
		System.out.println(number);
		while (number<100) {
			number += 10;
			System.out.println(number);
		}
		System.out.println("-----------");
		//100 90 80 70...-20
		int number2 = 100;
		System.out.println(number2);
		while (number2>-11) {
			number2 -=10;
			System.out.println(number2);
		}
		System.out.println("---------------------");
		//1 2 3 4 6 7 8 9 10 .. 5배수 빼고 찍기
		int number3 = 1;
		while (number3<=20) {
			if(number3%5 != 0) 
			//continue는 반복문을 계속해라 단, 아래 문장은 건너 뛰어라
			System.out.println(number3);
			number3 ++; {continue;}}
		
		// 1~100까지의 합계의 답은 5050이다.
		// 1~100까지 합계가 3000이 넘으면 멈추고 숫자와합계를 찍으세요.
		System.out.println("-------------------");
		int number5 = 1;
		int sum=0;
		while(number5<=100) {
			sum +=number5;
			if(sum>=3000) break;
			number5++;}
			System.out.println(number + "  " + sum);
			
			
//		    while (number5<=100 && sum<3000) {									
//			sum = sum+number5;		
//			System.out.println(number5 +"  " +sum);
//			number5++; 
			System.out.println("--------");
		//1~100까지 중에서 
		//1 2 3 4 5 6 .. 100
		//1 3 6 10 15 21 28 ..
		
		}

		
}
			
			
		
		

	


