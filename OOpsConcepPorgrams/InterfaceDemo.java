package oopsConcepts;

interface Shape{
	public void circle();
}

interface Drawable{
	public void traingle();
	public void circle();
}
class impl implements Shape, Drawable{

	@Override
	public void traingle() {
		// TODO Auto-generated method stub
		System.out.println(" We are drawing triangl ");
		
	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("We are drawing Circle");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		impl im = new impl();
		im.traingle();
		im.circle();

		// we can achieve multiple inheritance using the interface.
		// Interface is default abstract. All methods in the interface are abstract.
		// We can't instantiate the interface, so we need to create a child class of the interfaces to access it.
		// We have to add or override all the methods in the interface.
		
		
	}
	

}
