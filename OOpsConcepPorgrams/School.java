package oopsConcepts;

class Peerson{
	String name;
	String DOb;
	void getData(String name, String Dob) {
		this.name = name;
		this.DOb = Dob;
		System.out.println("Name  : "+name);
		System.out.println("Date of birth : "+ Dob);
	}
	
}

class Teacher extends Peerson {
	int tsalary;
	String t_sub;
	void teacher_info(int tsalary, String t_sub) {
		this.tsalary = tsalary;
		this.t_sub = t_sub;
	    System.out.println("Teacher Salary :" + tsalary);
	    System.out.println("Teacher's Subject :" + t_sub);
	    
	}
	
}

class Studentt extends Peerson{
	int st_id;
	void get_student(int st_id) {
		System.out.println("Student ID :"+st_id);
		
	}
	
}

class College extends Studentt{
	String college_name;
	int year_of_studying;
	void get_college(String college_name , int year_of_studying) {
		System.out.println("The NAME OF COLLEGE IS  : "+college_name);
		System.out.println("Year of Studying  :"+ year_of_studying);
	}
	
}

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher tr = new Teacher();
		
		College cl = new College();
		tr.getData("Gouri", "June 28 2000");
		tr.teacher_info(20000, "Maths");
		cl.get_student(101);
		cl.get_college("College of Computers ", 2);
		
		

	}

}
