package javaApp1.ch12.sec04;

import java.util.StringTokenizer;

public class StringTokenizerEz {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		//결과 화면이 홍길동 이수홍 박연수 로 출력되도록
		// 방법1 String 클래스의 split() 사용하기
		// 방법2 String Tokenizer 클래스 사용하기
		
		//방법 1)
		String arr[] = data1.split("&|,");
		for( int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		//향상된 for문
		for (String i : arr) {
			System.out.println(i);
		}
		
		//방법2 Tokenizer사용하기\
		String data2 = "홍길동/이수홍/박연수/이순신/최수진";
		StringTokenizer st = new StringTokenizer(data2, "/");
		//static으로 고정돼있지 않으니 객체화로 불러와야함
		while(st.hasMoreTokens()) {
			System.out.println( st.nextToken() );
		}
			//토큰이 있다면 True, 없다면 False로 마지막 Token 까지 출력을 했는지 확인해주는 함수
		
		String data3 = "사과-배-귤-바나나";
		StringTokenizer st2 = new StringTokenizer(data3, "-");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}	
		String data4 = "자바+파이썬+오라클+텐서플로어";
		StringTokenizer st3 = new StringTokenizer(data4, "+");
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
			
		}
	}

}
