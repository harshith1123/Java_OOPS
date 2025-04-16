package com.access_modifiers2;

import com.access_modifiers.Product;

public class ChildProductOutsidePackage extends Product{
	public void getDetails() {
		System.out.println(productPrice);
	}

}
