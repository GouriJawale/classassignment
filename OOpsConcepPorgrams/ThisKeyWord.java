package oopsConcepts;

import java.util.*;
class Student3{
	int id;
	String name,course,address;
	float fees;
	void setData(int id, String name, String course, String address, float fees) {
		this.id =id;
		this.name= name;
		this.course = course;
		this.address = address;
		this.fees = fees;
		getData();
		
	}
	void getData(){
		System.out.println("Student ID:" +id);
		System.out.println("Student Name:"+ name);
		System.out.println("Student Course:" +course);
		System.out.println("Student Address:" +address);
		System.out.println("Student fees:" +fees);
	}
	
}
public class ThisKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int stid, i,n;
		String stadd,Name,stcourse;
		float stfees;
		Student3 st = new Student3();
		System.out.println("Enter the number of students record you want to add:");
		n = sc.nextInt();
		System.out.println("--------------------------------------------------------------------------");
		for(i=1;i<=n;i++){
			System.out.println("Enter the student id:");
			stid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the student name:");
			Name = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the student course:");
			stcourse = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the student Address:");
			stadd = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the student fees:");
			stfees= sc.nextFloat();
			
			System.out.println("--------------------------------------------------------------------");
			st.setData(stid, Name, stcourse, stadd, stfees);
			
			
			
			
			
		}
	}

}
