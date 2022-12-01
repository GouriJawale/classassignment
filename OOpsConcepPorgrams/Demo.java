package oopsConcepts;

class Student{
	int id;
	String name, course, address;
	float fees;
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student gouri = new Student();
		gouri.id = 100;
		gouri.name = "Gouri Jawale" ;
		gouri.course = "MCA";
		gouri.address = "Osmanabad";
		gouri.fees = 20000;
		System.out.println("Student Name :" + gouri.name );
		System.out.println("Student id :" + gouri.id );
		System.out.println("Student Course :"+ gouri.course );
		System.out.println("Student Address :" + gouri.address );
		System.out.println("Student Fees :" + gouri.fees );

	}

}
