package com.inheritance;

class A{
	int data =100;	
}

class B extends A{
	int data = 200;
}

public class Test2 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.data);
		
		B b = new B();
		System.out.println(b.data);
		
		A ab = new B();  // dynamic dispatch
		System.out.println(ab.data);
		
//		B ba = new A();
	}
}
