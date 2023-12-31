package javaBasic.ch04.sec01;

public class While문연습 {

	public static void main(String[] args) {
		
			
		// 2 4 6 8 10 출력해보기
		int num = 0;
		while (num < 10) {
			num += 2;			
		System.out.println(num);
		}
		//do~while
//		do {
//			//반복할 내용
//		}while(조건식)
//	
		// 1 2 3 4 ... 10
		int num1 = 1;
		do { System.out.println(num1);
		num1++;	}
		while(num1<=10);
		
		// 10 9 8 7 ... 1
		int num2 = 10;
		do {System.out.println(num2);
		num2--;}
		while(num2>=1);
		
		//2 4 6 8 ... 20
		int num3 = 2;
		do {System.out.println(num3);
		num3+=2;}
		while(num3<=20);
		
		//5 10 15 20 25 30 ... 100
		int num4 = 1;		
		do {if (num4 % 5 == 0)
			System.out.println(num4);
		num4++;}
		while(num4<=100);
		
		//for문
		/*형식
		 * for(초기값;조건식;증가값){
		 *    반복할 내용들} 
		 */
		
		
		//1 2 3 .. 10 출력하기
		for ( int i=1; i <=10; i++) {
			System.out.println(i);
		}
		for (int j=1; j<=50; j++) {
			System.out.println(j);
		}
		for( int k=50; k>=1; k--) {
			System.out.println(k);
		}
		for(int i=1, j=10;i<=10 |j<=19 ;i++, j++) {
			System.out.println(i + "  " + j);
		}
		//변수 3개를 사용하여 1~100 100~1 200~300
		for(int i=1, j=100, k=200; i<=100 | j>=1 | k<300; i++, j--, k++) {
			System.out.println(i+ " " + j + " " + k);
		}
		for(int i=1;i<=3;i++) {
			System.out.println(i);
			for(int j=i ; j<=i+1 ; j++) {
			System.out.print( j +" ");}
		}
		for(int i=10;i<=11;i++) {
			System.out.println(i);
			for(int j=i; j<=i+1;j--) {
				System.out.print(j +" ");
				for(int k=j;k<=j;k--) {
					System.out.print(k+" ");
				}
			}
		}
	}
	
		
	}




