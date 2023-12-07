package javaBasic.ch01.sec12;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;					 //변수 x를 선언하고 1을 저장
		int y = 2; 					 //변수 y를 선언하고 2를 저장
		int result = x + y; 		 //변수 result를 선언하고 x와 y를 더한 값을 저장
		System.out.println(result);  //콘솔에 출력하는 메소드 호출
		
		int z = 3;
		int a = 4;
		int result2 = x + y + z + a;
		System.out.println(result2);
		

		//5명 아르바이트생 급여 게산하는 프로그램 작성하기
		//1명일 경우 급여 계산하기
		//형식 : 변수상태 변수명; 변수명 = 값;
		String name;
		name="홍길동";
		//string = 문자 int = 숫자
		int basicPay = 50000; //급여 (숫자 int)
		String phoneNumber = "010-1234-5678"; //전화번호(문자 string)
		String accountNumber ="국민 12-1234-123"; //계좌번호(문자 string)
		String dept = "알바생"; //직급(문자 string)
		boolean sex = true; //성별(남자 = true 여자 = false)
		double tax = 0.03; //세금(비율)
		
		String name1;
		name1="이순신";
		//string = 문자 int = 숫자
		int basicPay1 = 20000; //급여 (숫자 int)
		String phoneNumber1 = "010-234-4567"; //전화번호(문자 string)
		String accountNumber1 ="우리 321-32-4321"; //계좌번호(문자 string)
		String dept1 = "정직원"; //직급(문자 string)
		boolean sex1 = true; //성별(남자 = true 여자 = false)
		double tax1 = 0.02; //세금(비율)
		
		String name2;
		name2="이경미";
		//string = 문자 int = 숫자
		int basicPay2 = 15000; //급여 (숫자 int)
		String phoneNumber2 = "010-987-7456"; //전화번호(문자 string)
		String accountNumber2 ="신한 123-555-7878"; //계좌번호(문자 string)
		String dept2 = "팀장"; //직급(문자 string)
		boolean sex2 = false; //성별(남자 = true 여자 = false)
		double tax2 = 0.015; //세금(비율)
		
		String name3;
		name3="정현희";
		//string = 문자 int = 숫자
		int basicPay3 = 10000; //급여 (숫자 int)
		String phoneNumber3 = "010-8744-3334"; //전화번호(문자 string)
		String accountNumber3 ="국민 555-65-8989"; //계좌번호(문자 string)
		String dept3 = "사장"; //직급(문자 string)
		boolean sex3 = false; //성별(남자 = true 여자 = false)
		double tax3 = 0.025; //세금(비율)
		
		String name4;
		name4="최수연";
		//string = 문자 int = 숫자
		int basicPay4 = 9800; //급여 (숫자 int)
		String phoneNumber4 = "010-333-7777"; //전화번호(문자 string)
		String accountNumber4 ="카카오 777-454-1231"; //계좌번호(문자 string)
		String dept4 = "비정규직"; //직급(문자 string)
		boolean sex4 = false; //성별(남자 = true 여자 = false)
		double tax4 = 0.05; //세금(비율)
		
		//출력하기
		System.out.println("1번 알바 정보 : " + name + "  " + basicPay + "  " + phoneNumber );
		System.out.println(accountNumber + "  " + dept + "  " + sex + "  " + tax);
		System.out.println("2번 알바 정보 : " + name1 + "  " + basicPay1 + "  " + phoneNumber1 );
		System.out.println(accountNumber1 + "  " + dept1 + "  " + sex1 + "  " + tax1);
		System.out.println("3번 알바 정보 : " + name2 + "  " + basicPay2 + "  " + phoneNumber2 );
		System.out.println(accountNumber2 + "  " + dept2 + "  " + sex2 + "  " + tax2);
		System.out.println("4번 알바 정보 : " + name3 + "  " + basicPay3 + "  " + phoneNumber3 );
		System.out.println(accountNumber3 + "  " + dept3 + "  " + sex3 + "  " + tax3);
		System.out.println("5번 알바 정보 : " + name4 + "  " + basicPay4 + "  " + phoneNumber4 );
		System.out.println(accountNumber4 + "  " + dept4 + "  " + sex4 + "  " + tax4);
		
		//실지급액
		//1번 10시간 2번 15시간 3번 20시간 4번 25시간 5번 30시간
		//1번은 10시간 일해서  10 x 50000 = 500000 세후 500000 x 0.03 실수령액 = 500000- 세금액
		
		//50만원을 변수에 담는다
		int sum1 = 10 * basicPay;
		
		//세금을 계산한다
		//int taxCal = sum1 * tax; 이건 에러가 남
		double taxCal = sum1 * tax;
		double sal = sum1 - taxCal;
		System.out.println(sum1 + "  " + taxCal + "  " + sal);
		
		int sum2 = 10 * basicPay;
		double taxCal2 = sum2 * tax1;
		double sal2 = sum2 - taxCal2;
		System.out.println(sum2 + "  " + taxCal2 + "  " + sal2);
		
		int sum3 = 10 * basicPay;
		double taxCal3 = sum3 * tax2;
		double sal3 = sum3 - taxCal3;
		System.out.println(sum3 + "  " + taxCal3 + "  " + sal3);
		
		int sum4 = 10 * basicPay;
		double taxCal4 = sum4 * tax3;
		double sal4 = sum4 - taxCal4;
		System.out.println(sum4 + "  " + taxCal4 + "  " + sal4);
		
		int sum5 = 10 * basicPay;
		double taxCal5 = sum5 * tax4;
		double sal5 = sum5 - taxCal5;
		System.out.println(sum5 + "  " + taxCal5 + "  " + sal5);
	}

}
