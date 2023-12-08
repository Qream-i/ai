package javaBasic3.ch06.sec09;

import javaBasic3.ch06.sec05.Singleton;

public class ShopService {
	private static ShopService shopService= new ShopService();
	private ShopService () {
		//new 를 달면 실행되는 생성자, 외부에서 안되도록 private 달아주기
	}
	
	public static ShopService getInstance() {
		return shopService;
	}

}
