package javaBasic3.ch06.sec09;

import javaBasic3.ch06.sec05.Singleton;

public class ShopService {
	private static ShopService shopService= new ShopService();
	private ShopService () {
		//new �� �޸� ����Ǵ� ������, �ܺο��� �ȵǵ��� private �޾��ֱ�
	}
	
	public static ShopService getInstance() {
		return shopService;
	}

}