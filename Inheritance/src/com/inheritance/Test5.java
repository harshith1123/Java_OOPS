package com.inheritance;

class Base{
	Base(){
		System.out.println("From parent class");
	}	
}

class Derived extends Base{
	Derived(){
//		super();
//		this(10);
		System.out.println("from child");
	}
	
	Derived(int a){
		System.out.println("From one-arg constructor");
	}
}

public class Test5 {

	public static void main(String[] args) {
		Derived d = new Derived();

	}

}
