package com.encapsualtion;

class Employee{
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(101);
		System.out.println(e.getEmpId());

	}

}
