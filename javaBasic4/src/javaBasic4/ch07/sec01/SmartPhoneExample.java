package javaBasic4.ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//벨이 울립니다. 를 출력시키세요.
		Phone p=new Phone();
		p.bell();
		p.sendVoice("잘 잤어!");
		p.receiveVoice("잘 잤어 너도 잘 잤어?");
		
		SmartPhone sp = new SmartPhone();
		sp.sendVoice("오늘 뭐해?");
		sp.receiveVoice("오늘은 공부할거야");
		sp.hangUp();
		
		SmartPhone sp2 = new SmartPhone("아이폰", "흰색");
		System.out.println(sp2.model);
		
		sp2.setWifi(false);
		 if(sp2.wifi) {
			System.out.println(sp2.model + "은" +"와이파이가 연결되었습니다.");
		} else {
			System.out.println(sp2.color + " 핸드폰은 " + "와이파이 연결에 실패하였습니다.");
		}
		 System.out.println(sp2.model + "은 " + sp2.color + "이고 ");
		 p.bell();
		 System.out.println(sp2.model + "의 메세지가 왔습니다." );
		 sp2.sendVoice("핸드폰 샀어?");
		 
//		 //부모 클래스에서 자식의 wifi 필드, 메소드 사용하기
//		 부모클래스에서는 자식의 멤버들을 쓸 수 없다.
//		 p.wifi=true;
//		 p.setwifi()
		 
	}

}
