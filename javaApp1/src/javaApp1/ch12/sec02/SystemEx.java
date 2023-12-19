package javaApp1.ch12.sec02;

import java.io.IOException;

public class SystemEx {

	public static void main(String[] args) {
		try {
			
		
		System.err.println("에러 부분 출력 빨간색으로");
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.currentTimeMillis());//밀리초 1/1000초
		System.out.println(System.nanoTime()); // 나노초 1/10^9초
		int aa = System.in.read(); //키보드입력
		System.out.println(aa);
		} catch(IOException e){
			e.printStackTrace();
		}

	}

}
