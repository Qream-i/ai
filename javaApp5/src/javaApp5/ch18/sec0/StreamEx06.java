package javaApp5.ch18.sec0;

import java.util.*;

public class StreamEx06 {

	public static void main(String[] args) {
		// 루핑 : 반복해서 한개씩 가져와서 처리하기
		// 매칭 : 조건에 만족하는지 여부를 조사하는 최종 처리기능 p750
		
		int[] intArr = {2,4,6,7};
		boolean result=
				Arrays.stream(intArr)
					.allMatch(i -> i%2 ==0);//모든 스트림이 참
		
		System.out.println(result);
		
		result=
				Arrays.stream(intArr)
					.anyMatch(i -> i%2 ==0);//모든 스트림에서 한개만 참
		
		System.out.println(result);
		
		result=
				Arrays.stream(intArr)
					.noneMatch(i -> i%2 ==0);// 모든스트림에서 거짓이면 참
		
		System.out.println(result);
		
		int[] intArr2 = {1,2,3,4,5};
		long count=
				
				Arrays.stream(intArr2)
					.filter(n-> n%2 ==0)
					.count();
		System.out.println("짝수의 갯수는? " + count);
		
		long oddSum=
				
				Arrays.stream(intArr2)
					.filter(n-> n%2 !=0)
					.sum();
		System.out.println("홀수의 합은? " + oddSum);
			 

	}

}
