package javaBasic.ch03.sec02;

public class 대입연산자102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=100;
		count +=10; //count = count + 10;
		count -=20; // count=count-20;
		
		//수식을 대입연산자로 고쳐 보세요
		count*=5; //count = count*5;
		count /= 10; //count = count/10;
		count %=5; //count = count%5;
		boolean b1 = true;
		b1&=false; //b1=b1&&false;
		b1|=true; //b1=b1||true;
		
		//삼항연산자 = 조건연산자
		//형식 조건식 ? 참이면 : 거짓이면
		
		int score = 85;
		//90점 이상이면 장학생 아니면 비장학생이라고 출력하기
		String result = (score >= 90) ? "장학생" : "비장학생";
		
		System.out.println(result);
		
		//평균이 85.8보다 크고 합계가 1400이상이면 "통과" 아니면 "실패" 라고 출력
		int avg = 90;
		int sum = 1500;
		String result1 = (avg >= 85.8) && (sum >=1400) ? "통과" : "실패";
		System.out.println(result1);
		
		//이름이 "김수연"이거나 "이수연"이거나 "최수연"이면 "친구야! 안녕" 이라고 출력 아니면 "안녕하세요"
		String name = "이수연";
		String nameR = (name == "김수연" | name=="이수연" | name=="최수연") ? "친구야! 안녕" : "안녕하세요";
		System.out.println(nameR);

	}

}
