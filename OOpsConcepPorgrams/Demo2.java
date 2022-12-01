package oopsConcepts;

import java.util.*;

class Student1{
	int id;
	String address,course,name;
	float fees;
	
	void setData(int i, String add, String crs, String nm, float fs) {
		id= i;
		address=add;
		course= crs;
		name=nm;
		fees = fs;
	}
	void getData(){
		System.out.println("Student Name:"+ name);
		System.out.println("Student ID:"+ id);
		System.out.println("Student Course:"+ course);
		System.out.println("Student Address:"+ address);
		System.out.println("Student Fees:"+ fees);
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student1 st = new Student1();
		System.out.println("Enter a Student Name:");
		String stname = sc.nextLine();
		System.out.println("Enter a Student id:");
		int stid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a Student Course:");
		String stcourse = sc.nextLine();
        System.out.println("Enter a Student Fees:");
		float stfees = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter a Student Address:");
		String stadd = sc.nextLine();
		
		st.setData(stid,stadd,stcourse,stname,stfees);
		st.getData();
	}

}
