package javaApp1.ch12.sec03;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		//520pg
		String data = "자바";
		byte[] arr1 = data.getBytes();
		System.out.println(arr1[0]);
		System.out.println(arr1.length); //한글 한글자는 2byte
		
		String str1 = Arrays.toString(arr1);
		System.out.println(str1);
		//[ㅈ, ㅏ, ㅂ, ㅏ ]를 유니코드로 한걸 찍어냄
		
		//StringBuilder 클래스
		data = data + "java";
		System.out.println(data);
		
		StringBuilder sb = new StringBuilder();
		sb.append("자바");
		System.out.println(sb);
		sb.append("java");
		System.out.println(sb);
		sb.insert(0, "a");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.toString();
	}

}
