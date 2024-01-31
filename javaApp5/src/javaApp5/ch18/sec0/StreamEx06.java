package javaApp5.ch18.sec0;

import java.util.*;

public class StreamEx06 {

	public static void main(String[] args) {
		// ���� : �ݺ��ؼ� �Ѱ��� �����ͼ� ó���ϱ�
		// ��Ī : ���ǿ� �����ϴ��� ���θ� �����ϴ� ���� ó����� p750
		
		int[] intArr = {2,4,6,7};
		boolean result=
				Arrays.stream(intArr)
					.allMatch(i -> i%2 ==0);//��� ��Ʈ���� ��
		
		System.out.println(result);
		
		result=
				Arrays.stream(intArr)
					.anyMatch(i -> i%2 ==0);//��� ��Ʈ������ �Ѱ��� ��
		
		System.out.println(result);
		
		result=
				Arrays.stream(intArr)
					.noneMatch(i -> i%2 ==0);// ��罺Ʈ������ �����̸� ��
		
		System.out.println(result);
		
		int[] intArr2 = {1,2,3,4,5};
		long count=
				
				Arrays.stream(intArr2)
					.filter(n-> n%2 ==0)
					.count();
		System.out.println("¦���� ������? " + count);
		
		long oddSum=
				
				Arrays.stream(intArr2)
					.filter(n-> n%2 !=0)
					.sum();
		System.out.println("Ȧ���� ����? " + oddSum);
			 

	}

}