package oopsConcepts;

class Bankb{
	
	int rateOfInterest() {
		
		return 8;
	}
}
class sbi extends Bankb{
	
	// overridden method
	@Override
     int rateOfInterest() {
		
		     return 7;
	}
}

class aXis extends Bankb{
	
	          // overridden method
       int rateOfInterest() { 
		 
		         return 5;
	}
	
}
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbi sb = new sbi();
		System.out.println("The interest rate is : " + sb.rateOfInterest() + "%");

	}

}
