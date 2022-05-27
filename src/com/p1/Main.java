package com.p1;

public class Main {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		System.out.println("Employee Details");
		e1.setName("Shubham");
		e1.setAge(20);
		e1.setPhone_number("9113434933");
		e1.setAddress("Bihar");
		e1.setSalary(33333);
		e1.printSalary();
		
		System.out.println("-------------------------");
		
		System.out.println("Manager Details");
		Manager m1 = new Manager();
		
		m1.setName("Ramlakhan");
		m1.setAge(20);
		m1.setSalary(34343);
		m1.setAddress("Sundari");
		m1.setPhone_number("9323423434");
		
		m1.printSalary();
//		System.out.println(e1.getName());
	
		
		
		
		
}

}

class Member{
	
	String Name;
	int Age;
	String Phone_number;
	String Address;
	double Salary;

	  void printSalary() {
		System.out.println("Name :" + Name);
		System.out.println("Salary :" + Salary);
		System.out.println("Phone :" + Phone_number);
		System.out.println("Address :" + Address);
		
		System.out.println("Salary :" + Salary);
		
		
	  }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	  
	  
	  
	  
	  
	  
}

class Employee extends Member{
	String Specialisation;
	String Department;
	
	
	Employee(){
//		this.Name = n;
//		this.Age = a;
//		this.Phone_number =ph;
//		this.Address = ad;
//		this.Salary = sal;
	}
}



class Manager extends Member{
	String Specialisation;
	String Department;
	
	Manager(){
//		this.Name = n;
//		this.Age = a;
//		this.Phone_number =ph;
//		this.Address = ad;
//		this.Salary = sal;
	}
}












//git remote set-url origin link