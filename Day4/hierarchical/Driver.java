package com.sumeet.inheritance.hierarchical;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		p = new Student("sumeet",22,"Male","CSE",25);
		System.out.println(p);
		p = new Employee("sumeet",22,"Male",03,54);
		System.out.println(p);
		
	}

}
