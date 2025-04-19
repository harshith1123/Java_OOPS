package com.access_modifiers;
//import com.access_modifiers2.*;

public class Main {
	public static void main(String[] args) {
//		Test t = new Test();
//		System.out.println(t.i);
		Product p = new Product();
		System.out.println(p.productId);
		System.out.println(p.producName);
//		System.out.println(p.productSecretKey);
		
		System.out.println(p.productPrice);
		
		ChildProduct c = new ChildProduct();
		System.out.println(c.productPrice);
	}

}
