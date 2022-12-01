package oopsConcepts;

class Person{
	int id;
	String name, address;
	//Single inheritance
	
	public Person(int id , String name, String address) {
		this.id = id;
		this.name= name;
		this.address = address;
	}
	
	void displayData() {
		System.out.println("Name : "+ name);
		System.out.println("ID : "+ id);
		System.out.println("Address : "+ address);
		
	}
}

class StudentDetails extends Person{
	
	float marks;
	public StudentDetails(int id, String name, String address, float marks) {
		
		super(id, name, address);
		
		this.marks = marks;
		
	}
	
	void getData() {
		super.displayData();
		System.out.println("Marks : " + marks);
	}
}

class Child1 extends StudentDetails {
	
	long phone;
	public Child1(int id, String name, String address, float marks, long phone) {
		super(id, name, address, marks);
		System.out.println("Phone NUmber : "+ phone);
		super.getData();
	}
}

public class SingleInheritanc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 ch = new Child1(101 , "Gouri", "Osmanabad",10.0f, 9890295);
		
		

	}

}
