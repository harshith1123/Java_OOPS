package com.abstraction;

// multiple inheritance problem 
interface E{
	void m1();
	
	public default void  m2() {
		
	}
}
interface F{
	void m1();
//	public default void m2() {	}
}

class Impl implements E,F{
	@Override
	public void m1() {
		System.out.println("Calling from implementing class");
		
	}
	
}

public class Test7 {

	public static void main(String[] args) {
		E e = new Impl();
		e.m1();
	}

}
