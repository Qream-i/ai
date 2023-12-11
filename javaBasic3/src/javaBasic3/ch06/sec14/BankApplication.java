package javaBasic3.ch06.sec14;

import java.util.Scanner;

public class BankApplication {
	Scanner sc = new Scanner(System.in);
	Account[] accounts = new Account[100];
	static int count = 0;//계좌생성카운트변수

	public void 계좌생성() {
		accounts[ count ]= new Account();
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		accounts[count].계좌번호 = sc.next();
		System.out.print("계좌주: ");
		accounts[count].계좌주 = sc.next();
		System.out.print("초기입금액: ");
		accounts[count].초기입금액 = sc.nextInt();
		accounts[count].set잔고(accounts[count].초기입금액);
		System.out.println("결과: 계좌가 생성되었습니다.");
		count=count+1;	
		
	}

	public void 계좌목록() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int i=0; i<count;i++) {
			System.out.println(accounts[i].get계좌번호() + " " + accounts[i].get계좌주() + " " + accounts[i].get잔고());			
		}			
		
	}

	public void 예금() {
		System.out.println("-------");
		System.out.println("  예 금 ");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String 예금할계좌번호 =sc.next();
		
		
		System.out.print("예금액: ");
		int 예금금액 = sc.nextInt();
		
		int i;
		boolean flag=false;
		for(i=0; i<count ; i++) {
			if(예금할계좌번호.equals(accounts[i].get계좌번호() )) {
				accounts[i].잔고 = accounts[i].get잔고() + 예금금액 ; //홍길동 잔고
				flag=true;
				break;}  //반복문 그만두고 i변수값을 기억해주어야 한다.			
			
		}if (!flag) System.out.println("계좌번호가 틀렸습니다. 확인하세요.");
			
		
	}

	public void 출금() {
		System.out.println("-------");
		System.out.println("  출 금 ");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String 출금할계좌번호 =sc.next();
		
		
		System.out.print("출금액: ");
		int 출금금액 = sc.nextInt();
		
		int i;
		boolean flag=false;
		for(i=0; i<count ; i++) {
			if(출금할계좌번호.equals(accounts[i].get계좌번호() )) {
				if(accounts[i].잔고 < 출금금액) {
					System.out.println("잔고가 부족합니다"); break;
				}
				accounts[i].잔고 = accounts[i].get잔고() - 출금금액 ; //홍길동 잔고
				flag=true;
				break;}  //반복문 그만두고 i변수값을 기억해주어야 한다.			
			
		}if (flag) System.out.println("출금이 성공되었습니다.");		
		
	}
	
	//계좌 생성
	//계좌 목록
	//예금
	//출금

}
