package com.inheritance;

class Vehicle{
	protected String type="car";
	String v1="a";
}

class Wheels extends Vehicle{
	int noOfWheels = 4;
	String v1 ="b";	
}

class Car extends Wheels{
	String brand ="HONDA";
	
	public void getDetails(){
		System.out.println("The type of vehicle is:"+super.type);
		System.out.println("The no of wheels are:"+super.noOfWheels);
		System.out.println("The Brand of car is:"+this.brand);
	}
}

public class Test7 {

	public static void main(String[] args) {
		Car ca = new Car();
		ca.getDetails();
		
		Vehicle v = new Car();
		System.out.println(v.v1);
	
		Wheels v1 = new Car();
		System.out.println(v1.v1);
	}

}
