package com.abstraction;

interface H{
//	int b=30;
}

interface M{
	void m1();  // by default all the methods inside the interface are all abstract methods
	
	public default void m2() {
		System.out.println("m2() called");
	}
	
	public static void m3() {
		System.out.println("m3() called");
	}
}
class MImpl implements M{
	@Override
	public void m2() {
		System.out.println("m2() called by child class");
	}
	
//	@Override
//	public static void m3() {
//		System.out.println("m3() called by child class");
//	}

	@Override
	public void m1() {
		System.out.println("m1() implemented");
		
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		M obj = new MImpl();
		obj.m1();
		obj.m2();
		M.m3();
	}

}
