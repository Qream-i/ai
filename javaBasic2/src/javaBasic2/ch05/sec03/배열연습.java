package javaBasic2.ch05.sec03;

public class 배열연습 {

	public static void main(String[] args) {
		// 배열:동일한 자료들의 집합,연속해서 저장되어있다.
		// 배열 쓰는 이유? 정수 100개를 기억해야 한다면 변수 100개 만들어야 함 배열로 선언한다.
		// 배열 만드는 방법? 1차원 2차원 3차원
		int[] arr = new int[] {1,2,3,4,5};
		String[] sArr = new String[] {"a","b"};
		double [] dArr = new double[] {1.1, 2.2, 3.3};
		boolean[] bArr = new boolean[] {true, false};
		
		byte[] byArr = new byte [] {1,2,3};
		short[] shArr = new short [] {6, 7};
		float[] fArr= new float[] {1.1f, 2.2f};
		
		//arr 배열의 [0]의 값 1을 출력하려면
		System.out.println(arr[0]);
		System.out.println(sArr[1]);
		System.out.println(dArr[2]);
		//arr배열의 [0]의 값 1을 10으로 변경
		arr[0] = 10;
		//방법2 빈 배열을 만들고 나중에 값을 넣기
		int [] intArr = new int[3];
		double[] doubleArr = new double[5];
		intArr[0] = 3;
		intArr[1] = 5;
		intArr[2] = 7;
		//문자열 4개를 넣는 빈 배열 만들기
		//내용은"a", "b", "c", "d"
		String [] num = new String[4];
		num[0]= "a";
		num[1]= "b";
		num[2]= "c";
		num[3]= "d";
		
		int[] intArr2=new int[100];
		for(int i=0; i<100; i++) {
			intArr2[i] = i+1;}
		for(int i=0; i<100; i++) {
			
			System.out.println(intArr2[i]);
		}
		int[] intArr10=null;//null 문자주소가 안들어갔다. 미지정
		int[] score = new int[] { 100, 90, 87, 90, 100};
		int sum=0;
		for(int i=0; i<5; i++) {
			sum += score[i];
		}
		int avg = sum/5;
		System.out.println("합계는: " + sum);
		System.out.println("평균은: " + avg);
		System.out.println(score.length);
		
		
		String[] season= {"Spring","Summer","Fall", "Winter"};
		System.out.println("season[0]: " + season[0]);
		System.out.println("season[1]: " + season[1]);
		System.out.println("season[2]: " + season[2]);
		System.out.println("season[3]: " + season[3]);
		
		season[1]="여름";
		System.out.println("season[1]: " + season[1]);
		System.out.println();
		
		int[] scores = {83, 90, 87};
		int sum1=0;
		for(int j=0; j<3; j++) {
			sum1+=scores[j];			
		}
		System.out.println("총합: " + sum1);
		double avg1 = (double) sum1/3;
		System.out.println("평균: " + avg1);
		
		String[] names=new String[30];
		System.out.println(names.length);
		
		//성적표 만들기
		//이름  점수
		//흥길동 100
		//김수진 90
		//이경주 85
		String[]names1= {"홍길동", "김수진","이경주"};
		int[]scores1= {100, 90, 85};
		
		for(int i=0; i<names1.length; i++) {
			System.out.println(names1[i] + "  " + scores1[i]);
		}
		
		String[]carname= {"싼타페", "코란도"};
		int[]csum= {35000000,24000000};
		int[]cprc= {15000000,5000000};
		int[]할부원금= {20000000,19000000};
		int[]상환기간= {36,24};
		double[]월납입금= {555555.56,791666.67};
		
		for(int i=0; i<2; i++) {
			System.out.println(carname[i] +" " + csum[i]+" "+ cprc[i] +" "+ 할부원금[i] +" "+ 상환기간[i] +" " + 월납입금[i]);
		}
		
		//부서의 정보를 배열에 담아서 출력하기
		String[]사번= {"J0001", "J0003", "J0008", "J0009"};
		String[]이름= {"홍길동", "이도현", "한미우", "박정진"};
		String[]부서= {"총무부", "영업부", "인사부", "영업부"};
		boolean[]성별= {true, true, true, true};
		System.out.println("사번" + "     " + "이름" + "   " + "부서" + "   " + "성별");
		for(int i=0;i<4; i++) {
			System.out.println(사번[i] + "  " + 이름[i] + "  " + 부서[i] + "  " + (성별[i] ? "남자" : "여자"));
		}
		System.out.println("---총무부인 사람---");
		for(int i=0;i<4;i++) {
			if (부서[i].equals("총무부")) {
				System.out.println(이름[i]);
			}
		}
		
	}

}
