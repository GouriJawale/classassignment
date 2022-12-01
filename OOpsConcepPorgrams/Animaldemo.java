package oopsConcepts;

class Animal {
	
	String animal;
	
	public String eat(){
		System.out.println("Different Animals have different eating habits");
	     return this.animal;
	}
	
	
	public String sleep() {
		System.out.println("Different Animals have different sleeping habits");
		return this.animal;
	}
	
	
}

class Bird extends Animal {
	String bird;
	public String eat(){
		System.out.println("Birds eats insects");
		return this.bird;
	}
	public String fly() {
		System.out.println("Birds have wings to fly");
		return this.bird;
	}
}
public class Animaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird bd = new Bird();
		bd.eat();
		bd.sleep();
		bd.fly();
		
		
	}

}
