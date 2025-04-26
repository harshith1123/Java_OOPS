package com.association;

class Engine{
	String type;
	Engine(String type){
		this.type = type;
	}
}

class Car{
	private String carName;
	private final Engine engine;
	
	Car(String carName,String type){
		this.carName = carName;
		engine = new Engine(type);
	}
	public void details() {
		System.out.println("The type of car is:"+this.carName+" and type of car is:"+this.engine.type);
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Car car = new Car("HONDA","Electic");
		car.details();

	}

}
