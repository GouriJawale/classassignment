package oopsConcepts;

class Parent{
	void parentMethon() {
		System.out.println("This the parent class method");
	}
}

class Child extends Parent {
	 
	void childMethod() {
		System.out.println("This is the child class method");
			}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		obj.childMethod();
		obj.parentMethon();

	}

}
