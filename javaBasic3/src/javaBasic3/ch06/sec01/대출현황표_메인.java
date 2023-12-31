package javaBasic3.ch06.sec01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 대출현황표_메인 {

	public static void main(String[] args) {
		
		Date now = new Date();
		String nowTime = now.toString();
		System.out.println(nowTime);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//날짜 형식을 만들어주는 class SimpleDateForamt
		System.out.println(sdf.format(now));

		//동일한 객체를 생성하고 내용만 다를 때 배열을 사용한다.
	 	대출현황표 d1 = new 대출현황표("J02-38", "이민주", new Date(), "주택자금대출", 27000000, 48);
	 	대출현황표 d2 = new 대출현황표("Y04-15", "진영태", new Date(), "예부적금담보대출", 3000000, 36);
	 	대출현황표 d3 = new 대출현황표("M02-06", "최철식", new Date(), "무보증신용대출", 2000000, 36);
	 	대출현황표 d4 = new 대출현황표("K03-05", "민승렬", new Date(), "국민주택기금대출", 15000000, 60);
	 	
	 	대출현황표[] dArr = {
	 			new 대출현황표("J02-38", "이민주", new Date(), "주택자금대출", 27000000, 48),
	 			new 대출현황표("Y04-15", "진영태", new Date(), "예부적금담보대출", 3000000, 36),
	 			new 대출현황표("M02-06", "최철식", new Date(), "무보증신용대출", 2000000, 36),
	 			new 대출현황표("K03-05", "민승렬", new Date(), "국민주택기금대출", 15000000, 60)	 			
	 	};
	 	    int sum = 0;
	 		int sum1 = 0;
	 		int avg = 0;
	 	for(int i =0; i<dArr.length;i++) {
	 		
	 		sum += dArr[i].대출금액;
	 		sum1 += dArr[i].기간;
	 		avg = sum1/dArr.length;
	 		System.out.println(dArr[i].get대출번호() + " " + dArr[i].get성명() + " " + dArr[i].get대출종류() + " " + dArr[i].get대출금액() + " " + dArr[i].get기간());		
	 	}
	 		System.out.println("대출금액의 총합: " + sum);
	 		System.out.println("대출기간의 평균: " + avg);
	 	

	}

}
