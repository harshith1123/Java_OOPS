package com.abstraction;

interface BroadBandService{
	void getNetworkName();
}


class Airtel implements BroadBandService{
	public void getNetworkName() {
		System.out.println("airtel");
	}
}
class Vodafone implements BroadBandService{
	public void getNetworkName() {
		System.out.println("vodafone");
	}
}

//
//class Airtel{
//	public void getNetworkName() {
//		System.out.println("airtel");
//	}
//}
//class Vodafone{
//	public void getNetworkName() {
//		System.out.println("vodafone");
//	}
//}

class Mobile{
//	private Airtel obj;
	private BroadBandService obj;
	Mobile(BroadBandService obj){
		this.obj = obj;
	}
//	Mobile(Airtel obj){
//		this.obj = obj;
//	}
	public void getName() {
		this.obj.getNetworkName();
	}
}
public class Test9 {

	public static void main(String[] args) {
//		Mobile m = new Mobile(new Airtel());
		Mobile m = new Mobile(new Airtel());
		m.getName();
		m = new Mobile(new Vodafone());
		m.getName();

	}

}
