package com.inheritance;


class X{
	X(){
		System.out.println("Calling from X");
	}	
}

 class Y extends X{
	Y(){
		super();
		System.out.println("Calling from Y");
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		Y obj = new Y();

	}

}
