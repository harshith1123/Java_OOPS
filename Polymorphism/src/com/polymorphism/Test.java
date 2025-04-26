package com.polymorphism;

class Dimension extends Test{
//	@Override
//	public static void main() {
//		System.out.println("Main method implementation");
//	}
	public static void area(double radius) {
		System.out.println("Area of circle :"+(Math.PI * radius * radius));
	}
	public static void area(int length, int breadth) {
		System.out.println("Area of rectangle:"+(length * breadth));
	}
	public static void area(float side) {
		System.out.println("Area of a sqaure:"+(side * side));
	}
}

public class Test {

	public static void main(String[] args) {
		Dimension.area(12,13);
		Dimension.area(12.3f);
		Integer[] arr= {1,2,3,4};
		main(arr);
		main();
	}
	public static void main(Integer[] args) {
		System.out.println("custom main method called");
	}
	public static void main() {
		System.out.println("Without parameter main method called");
	}
	

}
