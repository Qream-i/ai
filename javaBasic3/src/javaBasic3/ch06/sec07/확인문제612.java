package javaBasic3.ch06.sec07;

import java.util.Scanner;

public class 확인문제612 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		//Member usuer1 = new Member("홍길동", "hong");
	String id1;
	String pass;
	System.out.print("id>" );
	id1 = sc.next();
	System.out.print("password>");
	pass = sc.next();
	MemberService memberService = new MemberService();
	boolean result = memberService.login(id1,pass); 
	if(result) {
		System.out.println("로그인 되었습니다");
		memberService.logout(id1);
	} else {
		System.out.println("id 또는  password가 올바르지 않습니다.");
	}
	}
	
}



