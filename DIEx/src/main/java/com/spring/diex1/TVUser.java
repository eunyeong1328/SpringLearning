package com.spring.diex1;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		강결합 예시
//		SamsungTV sTV = new SamsungTV();
//		
//		sTV.samsungTVOn();
//		sTV.samsungTVOff();
		
		LgTV ltv = new LgTV();
		ltv.LgTVOn();
		ltv.LgTVOff();

	}

}
