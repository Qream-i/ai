package javaBasic2.ch05.sec03;

import java.util.Scanner;

public class 문자열추출 {

	public static void main(String[] args) {
		String title = "자바프래로그래밍"; //문자열 객체
		String title2 = new String("자바프로그래밍");
		System.out.println(title2.length());
		System.out.println(title2.charAt(1));
		
		//'밍'을 출력하기
		System.out.println(title2.charAt(6));
		
		title2=title2.replace("자바","java");
		System.out.println(title2);
		
		System.out.println(title2.substring(4,8));
		System.out.println(title.substring(0,2));
		//'밍'의 인덱스 번호 알기
		System.out.println(title.indexOf("밍"));
		System.out.println(title.indexOf("래", 4));
		
		String names = "홍길동,이순신,최민영"; //문자들을 한 덩어리로 인식
		String[] nameArr = names.split(",");//names.split를 통해 , 제외하고 찢기 > [배열] 로 나누기
		for(int i=0 ;i<nameArr.length; i++) {
			System.out.println(nameArr[i]);			
		}
		//예시
		String fruits = "사과-배-귤-바나나";
     	String[]fruArr=fruits.split("-");
		for(int i=0;i<fruArr.length;i++) {
		System.out.println(fruArr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 과일 사실래요?");
		String order = sc.nextLine();
		boolean flag = false;//과일이 있는지 없는지 체크하는 변수
	
		//향상된 for문
		// 형식 for (타입 변수: 집합){반복할 내용}
//		String fruit1 = "사과-배-귤-바나나";
//		for (String fruAr : fruit1) {
//			System.out.println(fruAr);			
//		}
	
		
		}

}
