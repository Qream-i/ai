package javaBasic2.ch05.sec03;

public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]intArr1 = { {1,2},{2,3},{3,4} };
		String[][]str= { {"a","b","c"},{"d","e","f"}};
		boolean[][] bArr = {{false,true}, {false, true}, {true,false}, {true,true}};
		
		
		//2차원 배열의 값을 출력하기
		System.out.println(intArr1[2][1]);
		System.out.println(str[1][1]);
		System.out.println(bArr[3][0]);
		
		//배열안에 모든 값 출력하기
		for(int i= 0; i<intArr1.length;i++) {
			for(int j=0;j<intArr1[i].length;j++) {
				System.out.print(intArr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
