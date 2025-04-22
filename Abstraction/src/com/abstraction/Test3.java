package com.abstraction;

//final class X{
 final class X{
//	final X() {}
	
	final int data =20;
	int a =30;
	
	public final static  void m1() {
		System.out.println("m1() called");
	}
}
//class Y extends X{}
public class Test3 {

	public static void main(String[] args) {
	X obj = new X();
	obj.a=32;
	System.out.println(obj.data);
	X.m1();
//	obj.data=30;

	}

}
