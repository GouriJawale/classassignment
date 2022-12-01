package oopsConcepts;

abstract class Demo1{
	public void setData() {
		System.out.println("This is non abstract method");
	}
	abstract public void display1();
	abstract public void display2();
}
class Demo3 extends Demo1{
	
	public void display1() {
		System.out.println("THis is the first abstract method");
	}
	public void display2() {
		System.out.println("This is another one abstract method");
	}
	
	// we should implement each and every abstract method declared in the abstract class else it will show error.
}
public class Abstractdemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Demo3 dm = new Demo3();
		dm.display1();
		dm.setData();
         dm.display2();
	}

}
