package javaBasic3.ch06.sec07;

import java.util.Scanner;

public class Ȯ�ι���612 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		//Member usuer1 = new Member("ȫ�浿", "hong");
	String id1;
	String pass;
	System.out.print("id>" );
	id1 = sc.next();
	System.out.print("password>");
	pass = sc.next();
	MemberService memberService = new MemberService();
	boolean result = memberService.login(id1,pass); 
	if(result) {
		System.out.println("�α��� �Ǿ����ϴ�");
		memberService.logout(id1);
	} else {
		System.out.println("id �Ǵ�  password�� �ùٸ��� �ʽ��ϴ�.");
	}
	}
	
}



