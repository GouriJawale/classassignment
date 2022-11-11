package oopsConcepts;
//Constructor

import java.util.*;
class Abc{
	String name, designation;
	int id;
	float salary;
	public Abc(String name, String designation, int id, float salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.id = id;
		
		get();
	}
	
	void get() {
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee ID: "+ id);
		System.out.println("Employee Name: "+ designation);
		System.out.println("Employee Name: "+ salary);
		
	}
}
public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i;
		float sal;
		String nm, desig;
		System.out.println("Enter the employee name:");
		nm = sc.nextLine();
		System.out.println("Enter the Employee Id:");
		i = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee designation:");
		desig = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the employee salary:");
		sal = sc.nextFloat();
		
		System.out.println("=============================================================================================");
		
		Abc a = new Abc(nm, desig,i,sal);
		
		

	}

}
