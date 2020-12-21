package com.basicsstrong.reactive.section4;

public class Employee {
	
	private Integer id;
	private String name;
	double salary,rating;
	
	public Employee(Integer id, String name, double salary, double rating) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.rating = rating;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", rating=" + rating + "]";
	}
	
	
	
}
