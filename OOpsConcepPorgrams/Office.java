package oopsConcepts;

import java.util.*;
class Prson{
	String name;
	public String Prson() {
		
		return name;
		
	}
	
	
}
class Employeee extends Prson{
	double annual_salary;
	int work_start_year;
	long insurance_no;
	void Employeee() {
		
	}
	void setData(String name, double annual_salary, int work_start_year, long insurance_no) {
		this.annual_salary = annual_salary;
		this.work_start_year = work_start_year;
		this.insurance_no= insurance_no;
		super.name =name;
		
		}
	
	void getData() {
		System.out.println("Name            :" + name);
		System.out.println("Annual Salary   :" + annual_salary);
		System.out.println("Year of Joining :"+ work_start_year);
		System.out.println("Insurance Number:"+ insurance_no);
	}
	
}

public class Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double salary;
		int year;
		long num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.nextLine();
		System.out.println("Enter the annual salary :");
		salary = sc.nextDouble();
		System.out.println("Year of Joining :");
		year = sc.nextInt();
		System.out.println("Enter Insurance Number:");
		num = sc.nextLong();
		
		Employeee em = new Employeee();
		em.setData(name, salary, year, num);
		em.getData();
		
		
		
		
		
		

	}

}
