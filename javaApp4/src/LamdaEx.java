

public class LamdaEx {

	public static void main(String[] args) {
		// ���1
		Inter01Impl i01 = new Inter01Impl();
		i01.a();
		
		//���2 - �͸� ���� Ŭ����
		Inter01 i001 = new Inter01() {
					@Override
					public void a() {
						System.out.println("�͸� ���� Ŭ����");
						
					}
				};
		
//		i001.a();//�޼ҵ� ȣ��
//		Inter02 i002 = new Inter02() {
//					@Override
//					public void b() {
//						System.out.println("�͸� ���� Ŭ����");
//						
//					}
//				};
		//���ٽ���  interface �ȿ� method�� �ϳ��� �־����
		Inter01 lam001 = () ->  System.out.println("���ٷ� ������ Ŭ����");
		lam001.a();
		Inter02 lam002 = () -> System.out.println("���� ���� Ŭ����");
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
		System.out.println("�������̽��� ������ Ŭ����");
	}
}