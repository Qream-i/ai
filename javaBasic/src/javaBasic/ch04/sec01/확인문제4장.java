package javaBasic.ch04.sec01;

public class 확인문제4장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int sum3=0;
		for(int i=1 ; i<100 ; i++) {
			if(i%3==0) {	
				sum3=sum3+i;
				}
			}
		System.out.println("1~100까지 3의 배수 합은 :"+ sum3);
		
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
