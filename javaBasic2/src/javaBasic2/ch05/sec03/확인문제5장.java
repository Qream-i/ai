package javaBasic2.ch05.sec03;

public class 확인문제5장 {

	public static void main(String[] args) {
		// 6번
		int[][]array= {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		//7번
		int[]array1= {1, 5, 3, 8, 2};
		int max=0;
		
		for(int i = 0; i<array1.length; i++) {
			if (array1[i] > max) { 
				max = array1[i];			
			}			
		}
		System.out.println("최대값은 " + max);
		
		//최솟값 구하기
		int min = 100;
		for(int i = 0; i<array1.length;i++) {
			if(array1[i]<min) {
				min = array1[i];
			}
		}
		System.out.println("최소값은 " + min);
		
		//8번
		int[][]array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}			
		};
		int sum = 0;
		double avg = 0;
		for(int i =0; i<array2.length; i++) {
			for(int j =0; j<array2[i].length;j++) {
				sum= sum+ array2[i][j];
				int count = array2[0].length+array2[1].length+array2[2].length;
				avg= (double)sum/count;
			}
			
		}
		System.out.println("합계는: " + sum);
		System.out.println("평균은: " + avg);
	}

}
