package com.access_modifiers;

public class Main {
	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.productId);
		System.out.println(p.producName);
//		System.out.println(p.productSecretKey);
		
		System.out.println(p.productPrice);
		
		ChildProduct c = new ChildProduct();
		System.out.println(c.productPrice);
	}

}
