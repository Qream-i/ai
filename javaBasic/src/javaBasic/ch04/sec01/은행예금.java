package javaBasic.ch04.sec01;

import java.util.Scanner;

public class 은행예금 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("은행 예금프로젝트");
//		System.out.println("메뉴를 입력하세요?");
//		String menu = sc.nextLine();//키보드로 "1", "2"
//		int deposit=0;
//		int withdraw=0;
//		int balance=0;
//		
//		
//		
//		while( !menu.equals("4") ) {
//			System.out.println("---------------------------------");
//			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//			System.out.println("---------------------------------");
//			System.out.println("선택>");
//			menu = sc.nextLine();
//			
//			switch(menu) {
//			case "1":System.out.println("예금액>");
//					 deposit = sc.nextInt();
//				     System.out.println("잔액> " + deposit);
//					 sc.nextInt();;
//					 break;
//			case "2":System.out.println("출금액>");
//			         withdraw = sc.nextInt();
//			         sc.nextInt();
//			         balance =deposit-withdraw;
//			         break;
//			case "3":System.out.println("잔고>" + balance);
//			         break;
//			case "4":System.out.println("프로그램 종료");
//			         break;
//			default: System.out.println("메뉴를 잘못 누르셨습니다. 다시 눌러주세요");
//			
//			}
//		}
		Scanner sc1 = new Scanner(System.in);
		System.out.println("점수 조회");
		System.out.println("메뉴를 입력하세요");
		String mn = sc.nextLine();//키보드로 "1", "2"
		String name="학생명";
		int score=0;
		
		
		while( !mn.equals("4") ) {
			System.out.println("-----------------------------------");
			System.out.println("1. 학생명 | 2. 점수 | 3. 출력 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.println("선택>");
			mn = sc.nextLine();
			
			switch(mn) {
			case "1":System.out.println("학생명>");
					 name = sc.next();
					 sc.nextInt();
					 break;
			case "2":System.out.println("점수>");
			         score = sc.nextInt();
			         sc.nextInt();
			         break;
			case "3":System.out.println(name+"  " + score);
		             sc.nextInt();
			         break;
			case "4":System.out.println("프로그램 종료");
					 sc.nextInt();
			         break;
			default: System.out.println("잘못 입력");
			

	}
		
}
	}}
