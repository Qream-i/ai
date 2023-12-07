package javaBasic.ch01.sec15;

import java.nio.file.FileSystemNotFoundException;

public class DataTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자료형 - 기본형(정수형-byte, int, long/실수형-float, double/논리형-boolean/문자형-char)
		//정수처리 교재 39p
		byte b1 = 10; //-128 ~ 127
		System.out.println(b1);
		
		short s1 = 32767; //-32768 ~  32767
		long lo1 = 9000000000000000000l; //21조가 넘으면 int 달았을 때 error
		
		byte b2 = 20;
		byte b3 = 30;
		//byte b23 = b2 + b3; 
		// + 연산자는 int 형으로 처리함 
		// 해당 연산은 b2(byte) +(int) b3(byte) 니까, int로 담아야함 - 정보의 손실 방지
		int result23 = b2 + b3;
		
		short s2 = -20;
		short s3 = 20;
		int s23 = s2 - s3;
		
		byte b4 = 20;
		short s4 = 30;
		int bs4 = b4 + s4;
		
		float f1 = 3.14f;
		float f2 = 3.12345678f; //소수점은 7자리까지 출력
		System.out.println(f1 + "  " + f2);
		
		double d1 = 3.1234567890123456; //소수점 15자리가지 출력
		System.out.println(d1);
		
		//실수형은 float(4byte)와 double(8byte)형
		
		float f3 = 10.23f;
		float f4 = 2.45f;
		float f34 = f3*f4;
		double ff34 = f3*f4;
		System.out.println(f34);
		System.out.println(ff34);
		//소수점이 달라짐
		
		double d3 = 3.14;
		double d4 = 12.65;
		double d34 = d3*d4;
		System.out.println(d34);
		
		double dd34 = d3/d4; //float 자료형이 double형으로 변환된 - 형변환 cast 연산 자동형변환
		
		int iil=10;
		short ssl=20;
		
		float ffl=iil; //정수형이랑 실수형이랑 맡부으면 실수형으로 변환됨 - 형변환
		
		//실수형 --> 정수형 큰거에서 작은 것으로 떨어지기 때문에 데이터 손실이 있음
		//형식   정수형 변수명 = (정수형타입) 실수형변수
		
		//--(강제)형변환-- (down cast 연산; 큰 타입이 작은 타입으로 바뀜)
		double d10 = 3.14;
		int change1 = (int)d10;
		//실수형 변수명이 (int)를 통해 정수형으로 바뀌게 되지만 소수점의 손실이 생김
		System.out.println( d10 + "  " + change1);
		
		float f10 = 10.24f;
		byte changef10 = (byte)f10;
		System.out.println(f10 +" "+changef10);
		
		int i10 = 3000;
		short chi10 = (short) i10;
		System.out.println(chi10);
		
		//예제) 정수형으로 국어점수 수학점수 영어점수 변수 담으세요
		int kor = 95;
		int mat = 90;
		int eng = 93;
		int sum = kor + mat + eng;
		System.out.println("합계는 " + sum + "점");
		double sumd = (double) sum;
		double avg = sumd /3;
		System.out.println("평균은 " + avg + "점");
		//평균값을 낼 때에, 정수로 설정해두면 정수로만 점수가 나옴
		//=을 기준으로 오른쪽을 먼저 처리한 뒤에 왼쪽에 끼워맞추는 것이기 때문에, 정수로 먼저 취급하고 실수형으로 바꿈
		//방법 1) 미리 sum을 실수로 바꾼 다음에 계산
		//방법 2) 나누는 숫자를 실수로 바꿈
		//방법1-1) double avg1 = (double)sum/3;
		
		//수학점수의 거듭제곱 90^2 or 90**2
		int dmat = mat*mat;
		System.out.println("수학점수의 거듭제곱은 " + dmat);
		
		char ch1 = 'a';
		System.out.println((int)ch1);
		
		//a가 97로 출력되는 이유는 문자는 한글자 씩 유니코드로 구성되어있기 때문
		System.out.println( (char) ch1+3);
		System.out.printf("%c", ch1+3);
		//"%c"는 문자형으로 ch1+3의 유니코드 숫자를 문자형으로 출력하기
		
		//Korea를 출력하기
		System.out.printf("%c%c%c%c%c",75,111,114,101,97);

	}

}
