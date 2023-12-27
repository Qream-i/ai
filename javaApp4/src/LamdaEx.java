

public class LamdaEx {

	public static void main(String[] args) {
		// 방법1
		Inter01Impl i01 = new Inter01Impl();
		i01.a();
		
		//방법2 - 익명 구현 클래스
		Inter01 i001 = new Inter01() {
					@Override
					public void a() {
						System.out.println("익명 구현 클래스");
						
					}
				};
		
//		i001.a();//메소드 호출
//		Inter02 i002 = new Inter02() {
//					@Override
//					public void b() {
//						System.out.println("익명 구현 클래스");
//						
//					}
//				};
		//람다식은  interface 안에 method가 하나만 있어야함
		Inter01 lam001 = () ->  System.out.println("람다로 구현한 클래스");
		lam001.a();
		Inter02 lam002 = () -> System.out.println("람다 구현 클래스");
		lam002.b();

	}

}

interface Inter01{
	void a();
}
interface Inter02{
	void b();
}

class Inter01Impl implements Inter01{
	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스를 구현한 클래스");
	}
}