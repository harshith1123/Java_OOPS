package com.inheritance;

class Type{
	String type = "ecommerce";
	String type1 = "quick commerce";
	public Type() {
		System.out.println(this.type);
	}
}
class Ecommerce extends Type{
	
	Ecommerce(){
		super();
	}
}

class QuickCommerce extends Type{
	
	public void printType() {
		System.out.println(super.type1);
	}
	
}

public class Test8 {

	public static void main(String[] args) {
		Ecommerce e = new Ecommerce();
		QuickCommerce q = new QuickCommerce();
		q.printType();

	}

}
