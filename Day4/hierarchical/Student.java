package com.sumeet.inheritance.hierarchical;

public class Student extends Person{
	private String branch;
	private int rollNum;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public Student(String name, int age, String gender, String branch, int rollNum) {
		super( name, age, gender);
		this.branch = branch;
		this.rollNum = rollNum;
	}
	@Override
	public String toString() {
		return "Student [branch=" + branch + ", rollNum=" + rollNum + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getGender()=" + getGender() +  "]";
	}
	
	
}
