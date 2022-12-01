package oopsConcepts;

import java.util.*;
class Employee{
	 public float base_salary;
	public String nm,  emp_designation;
	public int emp_id;
	public float total_salary;
	
	void setEmpData(float base_salary,  String emp_n, int emp_id, String emp_designation) {
		this.base_salary = base_salary;
		
		this.nm = emp_n;
		this.emp_id = emp_id;
		this.emp_designation = emp_designation;
		String position = "manager";
		if (emp_designation.equals(position)) {
			total_salary = base_salary+2000;
		}
		else {
			total_salary = base_salary+1500;
			
		}
		
	}
	
	void getEmpData() {
		System.out.println("Employee Name: "+ nm);
		System.out.println("Employee Designation: "+ emp_designation);
		System.out.println("Employee ID: "+ emp_id);
		System.out.println("Employee Base Salary: "+ base_salary);
		System.out.println("Employee Total Salary "+ total_salary);
		
		
		
	}
	
}

public class EmpolyeeInfo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Employee em = new Employee();
		String Name, designation;
		float salary;
		int id, i;
		System.out.println("Enter the number of employee record you want to enter");
		int n = sc.nextInt();
		System.out.println("---------------------------------------------------------------------------------------------");
		for(i=1;i<=n;i++) {
			
		sc.nextLine();
		System.out.println("Enter the Emplyee name: ");
		Name = sc.nextLine();
		sc.nextLine();
		
		
        System.out.println("Enter the Employee ID : ");
		 id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Employee Designation : ");
		designation = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter the employee Base salary :");
		salary = sc.nextFloat();
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		em.setEmpData(salary,Name,id,designation);
		em.getEmpData();
		}

	}

}
