package javaApp2;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		int[] iarr= {1,2};
		for(int i : iarr) {
			System.out.println(i);
		}
		for(int i=0;i<iarr.length;i++) {
			System.out.println(iarr[i]);
		}
		
		//list의 구현 클래스인 ArraysList를 이용하여 새로 추가 용이하게
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//<E>는 제네릭 자료의 형을 미리 지정
		arrList.add(1);
		arrList.add(2);
		System.out.println(arrList.size());
		arrList.add(3);
		arrList.add(4);
		//0번 인덱스에 -7 넣기
		arrList.add(0, -7);
		//전체를 출력하고 싶을 때. 반복문 사용
		for(int i=0; i<arrList.size();i++) {
			System.out.print(arrList.get(i)+" "); // 인덱스 번호에 있는 요소 출력하기.
		}
		System.out.println();
		
		ArrayList<String> sArr =new ArrayList<String>();
		sArr.add("사과");
		sArr.add("배");
		sArr.add("귤");
		sArr.add("바나나");
		//귤과 바나나 사이에 파인애플넣기
		sArr.add(3, "파인애플");
		//3번인덱스인 바나나 자리에 들어가야하기 때문에 3
		//사과와 배 사이에 메론
		sArr.add(1,"메론");
		//귤을 천혜향으로 수정하기 - set 사용하기
		sArr.set(3, "천혜향");
		//바나나, 파인애플 지우기 
		sArr.remove(5);
		sArr.remove("파인애플");
		for(int i=0;i<sArr.size();i++) {
			System.out.print(sArr.get(i)+" ");
		}
		System.out.println();
		//파인애플이 있습니까? 묻기
		if (sArr.contains("파인애플")) {
			System.out.println("있습니다.");
		}else {
			System.out.println("없습니다.");
		}
		
		//사과와 배 있습니까?
		if(sArr.contains("사과") && sArr.contains("배")) {
			System.out.println("있습니다.");
		}else {
			System.out.println("없습니다.");
		}
		
		//배열 리스트가 비어있나요 ? isEmpty
		if(!sArr.isEmpty()) {
			sArr.clear(); // 요소 모두 지우기
			System.out.println("가게 물건을 모두 치웠습니다.");
		}
		

	}

}
