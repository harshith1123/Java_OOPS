package com.association;

// aggregation
class Address{
	String streetName;
	String city;
	String state;
	
	Address(String streetName,String city,String state){
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
}

class Student{
	private String name;
	private Address address;
	
	Student(String name,Address addr){
		this.name = name;
		this.address = addr;		
	}
	public void details() {
		System.out.println("The street name="+address.streetName+",city="+this.address.city+",state="+this.address.state+" and the student name="+this.name);
	}
	
}

public class Test1 {
	public static void main(String[] args) {
		Address a = new Address("Chitrigi","Kumta","Karnataka");
		Student s = new Student("Harshit",a);
		s.details();
	}
	
}
