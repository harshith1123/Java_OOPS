package com.access_modifiers2;

import com.access_modifiers.ChildProduct;
import com.access_modifiers.Product;

public class Test {
	int i=29;

	public static void main(String[] args) {
		Product p = new Product();
//		System.out.println(p.productId);
		System.out.println(p.producName);
//		System.out.println(p.productPrice);
		ChildProduct c = new ChildProduct();
//		System.out.println(c.productPrice);
		ChildProductOutsidePackage cp = new ChildProductOutsidePackage();
		cp.getDetails();
	}

}
