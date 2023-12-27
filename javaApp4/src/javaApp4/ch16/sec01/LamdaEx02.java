package javaApp4.ch16.sec01;

public class LamdaEx02 {

	public static void main(String[] args) {
		// "서울" --> 서울대학교 출력 "인천" -- 인천대학교
		
//		College<String> c = (name) -> { return name+"대학교"; };
//		College<String> c = (name) -> name+"대학교";
		College<String> c = (name) -> { return (name+"대학교");};
		
		
		System.out.println(c.cName("서울"));
		System.out.println(c.cName("인천"));
		
		Fruit<String> f = (name) -> name+" 사세요.";
		System.out.println(f.fName("사과"));
		System.out.println(f.fName("배"));
		//interface 새로하지 않고 College거 써도 됨
		
		College<Integer> m = price ->  {
			if (price >= 3000) return price + 10000;
			else return price - 5000;
		};
		System.out.println(m.cName(2000));
		System.out.println(m.cName(5000));
	}

}
@FunctionalInterface
interface College<T>{
	T cName(T name);
}

@FunctionalInterface
interface Fruit<T>{
	T fName(T name);
}