package javaBasic2.ch05.sec03;

import java.util.Scanner;

public class 학생점수분석 {

	public static void main(String[] args) {
		// 키보드 학생 수 입력, 학생들 점수 입력 받는다.
		Scanner sc=new Scanner(System.in);
		int menu = 1;
		int studentCount = 0;
		int[] score =null;
		while(menu!=5) {
			System.out.println("------------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("------------------------------------------------");
			System.out.print("선 택> ");
			menu=sc.nextInt();
			
			switch (menu) {
			case 1:System.out.print("학생수> ");
			studentCount = sc.nextInt();
			score = new int[ studentCount ];
//			System.out.println(schoolCount); 
			break;
			
			case 2:
				for(int i=0;i<score.length;i++) {
					System.out.print( "score[" + i +"]>");
					score[i] = sc.nextInt();
				}
					break;		
					
			case 3:
				for(int i=0;i<score.length;i++) {
					System.out.println( "score[" + i +"]:" + score[i] );
				}
				
				break;
				
			case 4:
				int max=0;
				int sum=0;
				double avg;
				for(int i=0; i<score.length;i++) {
					if(score[i]>max) 
					max=score[i];					
				sum =+ score[i];}
				avg = (double) sum/score.length;													
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				break;
				
			case 5: System.out.println("프로그램 종료");
				break;
				
			default: System.out.println("1~5의 숫자를 입력하시오.");
			     
			    	   
			
			}
		}

	}

}
