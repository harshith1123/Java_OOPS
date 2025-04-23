package com.polymorphism;

class Parent{
	public void m1() {
		System.out.println("calling from parent");
	}
}
class Child extends Parent{
	@Override
	public void m1() {
		System.out.println("calling from child");
	}
//	@Override
//	public int m1() {
//		System.out.println("Calling with some return type");
//		return 0;
//	}
}

public class Test2 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		
		 p = new Child();
		 p.m1();
	}

}
