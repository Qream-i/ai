package javaBasic.ch03.sec01;

public class 변수복습 {

	public static void main(String[] args) {
		String vehicleName = "싼타매";
		String vehicleName2 = "코란다";
		//차량명
		int veh1t = 35000000;
		int veh2t = 24000000;
		//차량총액
		int veh1d = 15000000;
		int veh2d = 5000000;
		//인도금
		int veh1 = veh1t - veh1d;
		int veh2 = veh2t - veh2d;
		//할부원금
		int veh1r = 36;
		int veh2r = 24;
		//상환기간(월)
		float veh1mo = 555555.56f;
		float veh2mo = 791666.67f;
		float veh1m = (float)veh1 / veh1r;
		float veh2m = (float)veh2 / veh2r;
		System.out.println(vehicleName + "의 월납입금은 " + veh1m);
		System.out.println(vehicleName2 + "의 월납입금은 " + veh2m);
		
		// TODO Auto-generated method stub

	}

}
