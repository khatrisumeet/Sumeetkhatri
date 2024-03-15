package com.sumeet.inheritance.hierarchical;

public class Employee extends Person{
	private int empId;
	private int deptId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Employee() {
		super();
	}
	public Employee(String name, int age, String gender,int empId, int deptId) {
		super( name,  age,  gender);
		this.empId = empId;
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptId=" + deptId + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + "]";
	}
	
}
