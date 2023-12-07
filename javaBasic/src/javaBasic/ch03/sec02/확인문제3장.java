package javaBasic.ch03.sec02;

public class 확인문제3장 {

	public static void main(String[] args) {
		// 1. 31
		// 2. 나
		// 3.
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent = pencils/students;
		int pencilsLeft = pencils % students;
		System.out.println("학생 한명이 가지는 연필 수:"+pencilsPerStudent);
		System.out.println("남은 연필 수:"+pencilsLeft);
		
		// 4.
		int value = 356;
		System.out.println(value-value%100);
		System.out.println(((int)((float)value/100.0))*100);
		
		//5 
		int lenghtTop = 5;
		int lenghtBottom = 10;
		int height = 7;
		double area = (double)((lenghtTop+lenghtBottom)*height/2);
		
		//6
		int x1 = 10;
		int y1 = 5;
		System.out.println((x1>7) && (y1<=5));
		System.out.println((x1%3 == 2)||(y1%2 != 1));
				
		//7 
		//Double. 이라는 class 는 물어봄. 
		//Double.isNaN > NaN이니?
		double x2 = 5.0;
		double y2 = 0.0;
		double z2 = 5 % y2;
		if ( Double.isNaN(z2) ){
			System.out.println("0.0d으로 나눌 수 없습니다.");
		}  else{
			double result2 = z2 + 10;	
			 System.out.println("결과: " + result2);
		}; 

	}

}
