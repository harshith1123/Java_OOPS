package com.inheritance;

class A1{
	public void m1() {
		System.out.println("From parent class");
	}
}

class B1 extends A1{
	public void m1() {
		System.out.println("From child class");
	}
}

public class Test3 {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.m1();  // child class
		
		A1 obj1 = new A1();
		obj1.m1(); // parent class
		
		A1 obj2 = new B1();
		obj2.m1(); // child class

	}

}
