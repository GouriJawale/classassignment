package oopsConcepts;

final class FinalDemo{
	 final int var;
	int dis1(final int n) {
		
		return n*n*n;
	
	}
	public FinalDemo(int var) {
		this.var=var;
		System.out.println("This is the final variable accessed initialized value using the constructor"+var);
	}
}


public class FinalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo fm = new FinalDemo(10);
		
		int cube = fm.dis1(5);
		System.out.println(cube);
		
		// If we have to give value to the final variable declared in the class then we have to give it using the constructor. So it is called as Blank Fial variable.
		//we can write the final class , final variable, fianl method as well.
		// We cannot override the final method.
		
		// But we can inherit the final method. That is we can call the final method using the child class object.
		// we also can delcare final parameter.
		// we cannot declare constructor as final.
		// we cannot make subclass of the final class i.e we cannot inherit the final class.
		

	}

}
