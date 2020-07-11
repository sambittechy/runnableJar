package com.ddlab.rnd;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
public class Test {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setName("John");
		emp1.setAge(23);
		
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setName("Ruby");
		emp2.setAge(27);
		
		empList.add(emp2);
		System.out.println(empList);
		
		Employee emp3 = new Employee();
		emp3.setName("Ruby");
		emp3.setAge(27);
		
		empList.remove(emp3);
		System.out.println(empList);
		
		if(emp1 != emp2) {
			
		}

	}

}
